package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class ClassicModelsDAOImpl<T, V> implements ClassicModelsDAO<T, V> {

	EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
	EntityManager em;

	protected final Class<T> type;

	public ClassicModelsDAOImpl(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public List<T> getAll() {
		em = emf.createEntityManager();
		TypedQuery<T> query = em.createQuery("from " + type.getName(), type);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAllHibernate(){
		return em.unwrap(Session.class).createQuery("from " + type.getName()).list();
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
	public void update(T t) {
		em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.unwrap(Session.class).update(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.clear();
		}
	}

}
