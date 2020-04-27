package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {

	@Id
	@Column(name = "orderNumber")
	private Integer orderNumberId;
	@Id
	@Column(name = "productCode")
	private String productCodeId;
	private Integer quantityOrdered;
	private double priceEach;
	private Integer orderLineNumber;

	public OrderDetail() {
	}

	public OrderDetail(Integer orderNumberId, String productCodeId, Integer quantityOrdered, double priceEach,
			Integer orderLineNumber) {
		super();
		this.orderNumberId = orderNumberId;
		this.productCodeId = productCodeId;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
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

	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public Integer getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(Integer orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderNumberId=" + orderNumberId + ", productCodeId=" + productCodeId
				+ ", quantityOrdered=" + quantityOrdered + ", priceEach=" + priceEach + ", orderLineNumber="
				+ orderLineNumber + "]";
	}

}
