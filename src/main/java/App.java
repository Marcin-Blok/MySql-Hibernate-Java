import java.util.ArrayList;
import java.util.List;

import pl.marcinblok.jpa.mysqlhibernatejava.dao.ClassicModelsDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.dao.ClassicModelsDAOImpl;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Office;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Order;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.OrderDetail;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Product;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.ProductLine;

public class App {
	public static void main(String[] args) {
		
		// office
		Office office = new Office("DEV-1456", "Boston", "0136465734", "woiejfw", "doweijewijwo", "New Jersey", "USA",
				"057-NY", "owijf");
		Office office2 = new Office("RM-1216", "Praga", "475623970", "Rynek 6", "RUE89U", "NA", "Czechy", "12-26-4",
				"EU");
		ClassicModelsDAO<Office, String> officeDAO = new ClassicModelsDAOImpl<>(Office.class);
		officeDAO.add(office);
		officeDAO.add(office2);
		
		
		// product line
		ProductLine productLine = new ProductLine("buty556", "cos cos tam", "<p> cos tam opis</a>", null);
		ClassicModelsDAO<ProductLine, String> productLineDAO = new ClassicModelsDAOImpl<>(ProductLine.class);
		productLineDAO.add(productLine);
		productLineDAO.remove(productLine.getProductLineId());

//		Product product = new Product("22", "maseczka", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		Product product2 = new Product("235", "maseczka2", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		ClassicModelsDAO<Product, String> productDAO = new ClassicModelsDAOImpl<>(Product.class);
//		productDAO.add(product);
		productDAO.add(product2);

		ProductLine findedProduct = productLineDAO.get("Ships");
		System.out.println(findedProduct.getProductLineId());
		System.out.println(findedProduct.getProducts());

		List<Product> products = new ArrayList<>();
		products.add(new Product("556", "maseczki3", "buty21", "asdf", "asdf", "adf", 22, 23, 22.22));
		products.add(new Product("566", "maseczki4", "buty21", "asdf", "asdf", "adf", 22, 23, 22.22));
		productLine = new ProductLine("buty21", "cos cos tam", "<p> cos tam opis</a>", null, products);

		productLineDAO.add(productLine);
		
		// test jeden do wilu, wiele do jeden
		
		// Pan Jurek kupuje ciasteczka
		
		
		// koszyk
		List<OrderDetail> orders = new ArrayList<>();
		
		
	}
}
