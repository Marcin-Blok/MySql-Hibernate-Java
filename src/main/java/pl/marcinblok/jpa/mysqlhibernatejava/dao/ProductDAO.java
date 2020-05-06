package pl.marcinblok.jpa.mysqlhibernatejava.dao;

import java.util.List;

import javax.persistence.Query;

import pl.marcinblok.jpa.mysqlhibernatejava.entity.Product;

public class ProductDAO extends ClassicModelsDAOImpl<Product, String>{

	public ProductDAO(Class<Product> type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Product> getAll() {
		em = emf.createEntityManager();
		Query query = em.createQuery("from Product p JOIN p.orderDetails od JOIN od.order");
		return query.getResultList();
	}

}
