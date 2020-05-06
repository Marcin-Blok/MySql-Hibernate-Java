package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class ClassicModelsDAOImpl<T, V> implements ClassicModelsDAO<T, V> {

	EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
	EntityManager em;

	private final Class<T> type;

	public ClassicModelsDAOImpl(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public List<T> getAll() {
		em = emf.createEntityManager();
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(V v) {
		em = emf.createEntityManager();
		return em.find(type, v);
	}

	@Override
	public void save(T t) {
		em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(t);
			et.commit();
		} catch (Exception e) {
			et.rollback();
		} finally {
			em.close();
		}

	}

	@Override
	public void remove(V v) {
		em = emf.createEntityManager();
		T t = get(v);

		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.remove(t);
			et.commit();
		} catch (Exception e) {
			et.rollback();
		} finally {
			em.close();
		}

	}

	@Override
	public void update(T t, V v) {
		em = emf.createEntityManager();
		Query query = em.createQuery("UPDATE <?> SET column_name = :newValue WHERE column_name = :oldValue");
		query.setParameter("newValue", t);
		query.setParameter("oldValue", v);
		try {
			em.getTransaction().begin();
			query.executeUpdate();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
		}finally {
			em.clear();
		}
	}

}
