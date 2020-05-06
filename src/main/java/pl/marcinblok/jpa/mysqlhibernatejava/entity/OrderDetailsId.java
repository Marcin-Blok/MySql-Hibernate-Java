package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailsId implements Serializable {

	@Column(name = "orderNumber")
	private Integer orderNumberId;

	@Column(name = "productCode")
	private String productCodeId;

	public OrderDetailsId() {}
	
	public OrderDetailsId(Integer orderNumberId, String productCodeId) {
		super();
		this.orderNumberId = orderNumberId;
		this.productCodeId = productCodeId;
	}

	public Integer getOrderNumberId() {
		return orderNumberId;
	}

	public void setOrderNumberId(Integer orderNumberId) {
		this.orderNumberId = orderNumberId;
	}

	public String getProductCodeId() {
		return productCodeId;
	}

	public void setProductCodeId(String productCodeId) {
		this.productCodeId = productCodeId;
	}

	@Override
	public String toString() {
		return "OrderDetailsId [orderNumberId=" + orderNumberId + ", productCodeId=" + productCodeId + "]";
	}

}
