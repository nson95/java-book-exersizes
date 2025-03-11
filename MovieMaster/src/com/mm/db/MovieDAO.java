package com.mm.db;

import java.util.ArrayList;
import java.util.List;

import com.mm.model.Movie;

public class MovieDAO implements DAO<Movie> {

	private List<Movie> movies = new ArrayList<>();
	@Override
	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return movies;
	}

	@Override
	public Movie getByID(int id) {
		Movie m = null;
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				movie = m;
				break;
			}
		}
		return m;
	}

	@Override
	public Movie add(Movie m) {
		movies.add(m);
		return m;
	}

	@Override
	public void update(Movie m) {
		for (Movie movie: movies) {
			if (movie.getId() == m.getId()) {
				movie = m;
				break;
			}
		}
	}

	@Override
	public void delete(int id) {
		for (Movie movie: movies) {
			if (movie.getId() == id) {
				movies.remove(id);
				break;
			}
	}

	}
}
