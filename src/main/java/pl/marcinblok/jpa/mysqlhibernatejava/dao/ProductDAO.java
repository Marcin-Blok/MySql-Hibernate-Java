package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import pl.marcinblok.jpa.mysqlhibernatejava.entity.Product;

public class ProductDAO implements ClassicModelsDAO<Product, String>{

	EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
	EntityManager em = emf.createEntityManager();

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getById(String v) {
		return em.find(Product.class, v);
	}

	public void add(Product t) {
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

	public void remove(Product t) {
		t = getById(t.getProductCodeId());

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

	public void update(Product t) {
		// TODO Auto-generated method stub

	}

}
