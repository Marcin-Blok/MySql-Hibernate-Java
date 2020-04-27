package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

public interface ClassicModelsDAO<T, V> {
	List<T> getAll();
	T getById(V v);
	void add(T t);
	void remove(T t);
	void update(T t);
}
