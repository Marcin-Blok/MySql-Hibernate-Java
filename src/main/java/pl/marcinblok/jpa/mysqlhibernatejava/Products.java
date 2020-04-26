package pl.marcinblok.jpa.mysqlhibernatejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {

	@Id
	@Column(name = "productCode")
	private String productCodeId;
	private String productName;
	private String productLineId;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private Integer quantityInStock; // smallint(6)
	private double buyPrice; // decimal(10,2)
	private double MSRP; // decimal(10,2)

	public Products() {
	}

	public Products(String productCodeId, String productName, String productLineId, String productScale,
			String productVendor, String productDescription, Integer quantityInStock, double buyPrice, double mSRP) {
		super();
		this.productCodeId = productCodeId;
		this.productName = productName;
		this.productLineId = productLineId;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		MSRP = mSRP;
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

	public String getProductLine() {
		return productLineId;
	}

	public void setProductLine(String productLine) {
		this.productLineId = productLine;
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

	@Override
	public String toString() {
		return "Products [productCode=" + productCodeId + ", productName=" + productName + ", productLine="
				+ productLineId + ", productScale=" + productScale + ", productVendor=" + productVendor
				+ ", productDescription=" + productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice="
				+ buyPrice + ", MSRP=" + MSRP + "]";
	}

}
