package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import pl.marcinblok.jpa.mysqlhibernatejava.entity.ProductLine;

public class ProductLineDAO implements ClassicModelsDAO<ProductLine, String> {
	EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
	EntityManager em = emf.createEntityManager();

	public List<ProductLine> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductLine getById(String v) {
		em = emf.createEntityManager();
		return em.find(ProductLine.class, v);
	}

	public void add(ProductLine t) {
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

	public void remove(ProductLine t) {
		t = getById(t.getProductLineId());

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

	public void update(ProductLine t) {
		// TODO Auto-generated method stub

	}

}
