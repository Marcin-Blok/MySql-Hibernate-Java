import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import pl.marcinblok.jpa.mysqlhibernatejava.dao.ClassicModelsDAO;
import pl.marcinblok.jpa.mysqlhibernatejava.dao.ClassicModelsDAOImpl;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Customer;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Office;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.Order;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.OrderDetail;
import pl.marcinblok.jpa.mysqlhibernatejava.entity.OrderDetailsId;
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
		officeDAO.save(office);
		officeDAO.save(office2);
		
		
		// product line
		ProductLine productLine = new ProductLine("buty556", "cos cos tam", "<p> cos tam opis</a>", null);
		ClassicModelsDAO<ProductLine, String> productLineDAO = new ClassicModelsDAOImpl<>(ProductLine.class);
		productLineDAO.save(productLine);
		productLineDAO.remove(productLine.getProductLineId());

//		Product product = new Product("22", "maseczka", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		Product product2 = new Product("235", "maseczka2", "buty", "sadf", "asdf", "sdfsdf", 23, 2.3, 23.33);
		ClassicModelsDAO<Product, String> productDAO = new ClassicModelsDAOImpl<>(Product.class);
//		productDAO.add(product);
		productDAO.save(product2);

		ProductLine findedProduct = productLineDAO.get("Ships");
		System.out.println(findedProduct.getProductLineId());
		System.out.println(findedProduct.getProducts());

		List<Product> products = new ArrayList<>();
		products.add(new Product("556", "maseczki3", "buty21", "asdf", "asdf", "adf", 22, 23, 22.22));
		products.add(new Product("566", "maseczki4", "buty21", "asdf", "asdf", "adf", 22, 23, 22.22));
		productLine = new ProductLine("buty21", "cos cos tam", "<p> cos tam opis</a>", null, products);

		productLineDAO.save(productLine);
		
		// zamawiający
		Customer jurek = new Customer(1, "Jurek", "Nowak", "Jurek", "234234234", "", "", "Gdynia", "", "23-232", "", null, 22.0);
		Customer anna = new Customer(2, "Anna", "Kowal", "Anna", "848848848", "", "", "Gliwice", "", "11-992", "", null, 123122.0);
		ClassicModelsDAO<Customer, Integer> customerDAO = new ClassicModelsDAOImpl<>(Customer.class);
		customerDAO.save(jurek);
		customerDAO.save(anna);
		
		// product line
		productLine = new ProductLine("nabial", "", "<p> nabial</a>", null);
		productLineDAO.save(productLine);
				
		// product
		Product mleko = new Product("777", "mleko", "nabial", "asdf", "sdfa", "", 22, 2.22, 3.33);
		Product jogurt = new Product("778", "jogurt", "nabial", "asdf", "sdfa", "", 22, 1.22, 4.33);
		Product maslo = new Product("779", "maslo", "nabial", "asdf", "sdfa", "", 22, 5.22, 3.66);

		// zamówienie
		Order orderJurek = new Order(1, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", 1, null);
		Order orderAnna = new Order(2, LocalDate.now(), LocalDate.now(), LocalDate.now(), "", "", 2, null);
		
		// szczegóły zamówienia
		OrderDetail osiemMlek = new OrderDetail(new OrderDetailsId(1,"777"), 8, 2.22, 1, mleko, orderJurek);
		OrderDetail jedenJogurt = new OrderDetail(new OrderDetailsId(1,"778"), 1, 1.22, 1, jogurt, orderJurek);
		OrderDetail dwaMasla = new OrderDetail(new OrderDetailsId(1,"779"), 2, 3.22, 1,  maslo, orderJurek);
		
		OrderDetail jogurtyAnny = new OrderDetail(new OrderDetailsId(2,"778"), 5, 1.22, 1, jogurt, orderAnna);
		OrderDetail maslaAnny = new OrderDetail(new OrderDetailsId(2,"779"), 3, 3.22, 1,  maslo, orderAnna);
		
		
		ClassicModelsDAO<OrderDetail, Integer> orderDetailDAO = new ClassicModelsDAOImpl<>(OrderDetail.class);
		orderDetailDAO.save(osiemMlek);
		orderDetailDAO.save(jedenJogurt);
		orderDetailDAO.save(dwaMasla);
		orderDetailDAO.save(jogurtyAnny);
		orderDetailDAO.save(maslaAnny);
		
		
//		List<OrderDetail> listaJurka = new ArrayList<>();
//		listaJurka.add(osiemMlek);
//		listaJurka.add(jedenJogurt);
//		
//		List<OrderDetail> listaAnny = new ArrayList<>();
//		listaAnny.add(dwaMasla);
//		listaAnny.add(jedenJogurt);
				
		
		

	}
}
