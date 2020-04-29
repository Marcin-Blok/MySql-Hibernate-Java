import java.util.ArrayList;
import java.util.List;

import pl.marcinblok.jpa.mysqlhibernatejava.dao.OfficeDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.dao.ProductDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.dao.ProductLineDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Office;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Product;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.ProductLine;

public class App {
	public static void main(String[] args) {
		ProductLine productLine = new ProductLine("buty2", "cos cos tam", "<p> cos tam opis</a>", null);
		Office office = new Office("DEV-14", "Boston", "0136465734", "woiejfw", "doweijewijwo", "New Jersey", "USA", "057-NY", "owijf");
		Office office2 = new Office("RM-12", "Praga", "475623970", "Rynek 6", "RUE89U", "NA" , "Czechy", "12-26-4", "EU");
		
		OfficeDAO officeDAO = new OfficeDAO();
		officeDAO.add(office);
		officeDAO.add(office2);
		

		ProductLineDAO productLineDAO = new ProductLineDAO();
		productLineDAO.add(productLine);
		
		
		productLineDAO.remove(productLine);
		
		
//		Product product = new Product("22", "maseczka", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		Product product2 = new Product("23", "maseczka2", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		ProductDAO productDAO = new ProductDAO();
//		productDAO.add(product);
		productDAO.add(product2);
		
		ProductLine findedProduct = productLineDAO.getById("Ships");
		System.out.println(findedProduct.getProductLineId());
		System.out.println(findedProduct.getProducts());
		
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("55", "maseczki3", "buty2", "asdf", "asdf", "adf", 22, 23, 22.22));
		products.add(new Product("56", "maseczki4", "buty2", "asdf", "asdf", "adf", 22, 23, 22.22));
		productLine = new ProductLine("buty2", "cos cos tam", "<p> cos tam opis</a>", null, products);

		productLineDAO = new ProductLineDAO();
		productLineDAO.add(productLine);
		
		
		
	}
}
