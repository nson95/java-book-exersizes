package com.mm.db;

import java.util.List;

public interface DAO<T> {
	List<T> getAll();
	T getByID(int id);
	T add(T t);
	void update(T t);
	void delete(int id);
}