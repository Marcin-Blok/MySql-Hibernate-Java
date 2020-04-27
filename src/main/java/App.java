import pl.marcinblok.jpa.mysqlhibernatejava.dao.ProductDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.dao.ProductLineDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Product;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.ProductLine;

public class App {
	public static void main(String[] args) {
		ProductLine productLine = new ProductLine("buty2", "cos cos tam", "<p> cos tam opis</a>", null);

		ProductLineDAO productLineDAO = new ProductLineDAO();
		productLineDAO.add(productLine);
		
		
		productLineDAO.remove(productLine);
		
		
		Product product = new Product("22", "maseczka", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		ProductDAO productDAO = new ProductDAO();
		productDAO.add(product);
		
	}
}
