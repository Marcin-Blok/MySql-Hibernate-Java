package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "productCode")
	private String productCodeId;
	private String productName;
	@Column(name = "productLine")
	private String productLineId;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private Integer quantityInStock; // smallint(6)
	private double buyPrice; // decimal(10,2)
	private double MSRP; // decimal(10,2)

	@OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
	private List<OrderDetail> orderDetails = new ArrayList<>();

	public Product() {
	}

	public Product(String productCodeId, String productName, String productLineId, String productScale,
			String productVendor, String productDescription, Integer quantityInStock, double buyPrice, double MSRP, List<OrderDetail> orderDetails) {
		super();
		this.productCodeId = productCodeId;
		this.productName = productName;
		this.productLineId = productLineId;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.MSRP = MSRP;
		this.orderDetails = orderDetails;
	}

	public Product(String productCodeId, String productName, String productLineId, String productScale,
			String productVendor, String productDescription, Integer quantityInStock, double buyPrice, double MSRP) {
		super();
		this.productCodeId = productCodeId;
		this.productName = productName;
		this.productLineId = productLineId;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.MSRP = MSRP;
	}

	public String getProductCodeId() {
		return productCodeId;
	}

	public void setProductCodeId(String productCodeId) {
		this.productCodeId = productCodeId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLineId() {
		return productLineId;
	}

	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMSRP() {
		return MSRP;
	}

	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Product [productCodeId=" + productCodeId + ", productName=" + productName + ", productLineId="
				+ productLineId + ", productScale=" + productScale + ", productVendor=" + productVendor
				+ ", productDescription=" + productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice="
				+ buyPrice + ", MSRP=" + MSRP + "]";
	}

}
