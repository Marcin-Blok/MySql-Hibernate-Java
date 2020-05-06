package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

public interface ClassicModelsDAO<T, V> {
	List<T> getAll();
	T get(V v);
	void save(T t);
	void remove(V v);
	void update(T t, V v);
}
