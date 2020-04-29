package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import pl.marcinblok.jpa.mysqlhibernatejava.entity.Office;

public class OfficeDAO implements ClassicModelsDAO<Office, String>{
	
	EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("db-unit");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public List<Office> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Office getById(String v) {
		em = emf.createEntityManager();
		return em.find(Office.class, v);
	
	}
	@Override
	public void add(Office t) {
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
	public void remove(Office t) {
		t = getById(t.getOfficeCodeId());

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
	public void update(Office t) {
		// TODO Auto-generated method stub
		
	}


}
