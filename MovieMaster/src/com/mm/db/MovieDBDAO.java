package com.mm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mm.model.Movie;

public class MovieDBDAO implements DAO<Movie>{
	private static String dbUrl = "jdbc:mysql://localhost:3306/bmdb";
	private static String username = "bmdb_user";
	private static String password = "sesame";
	
	private static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		return conn;
	}
	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		String sql = "SELECT * FROM Movie ORDER BY Id;";
		
		
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				// process one row
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int year = rs.getInt(3);
				String rating = rs.getString(4);
				String director = rs.getString(5);
				Movie m = new Movie(id, title, year, rating, director);
				movies.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return movies;
	}

	@Override
	public Movie getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie add(Movie m) {
		String sql = "INSERT INTO Movie (Title, Year, Rating, Director)"
				+"VALUES (?, ?, ?, ?);";
//				+ "Values ("+m.getTitle()+", "+m.getYear()+", " +m.getRating()+", "
//				+m.getDirector()+");";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
 		return m;
	}

	@Override
	public void update(Movie t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM Movie WHERE Id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
