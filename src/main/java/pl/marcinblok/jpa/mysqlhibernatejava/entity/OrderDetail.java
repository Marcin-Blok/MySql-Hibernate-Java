package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {

	@EmbeddedId
	private OrderDetailsId id;

	private Integer quantityOrdered;
	private double priceEach;
	private Integer orderLineNumber;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="productCode", nullable=false, insertable=false, updatable=false)
	private Product product;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="orderNumber", nullable=false, insertable=false, updatable=false)
	private Order order;

	public OrderDetail() {
	}

	public OrderDetail(OrderDetailsId id, Integer quantityOrdered, double priceEach, Integer orderLineNumber) {
		super();
		this.id = id;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public OrderDetail(OrderDetailsId id, Integer quantityOrdered, double priceEach, Integer orderLineNumber,
			Product product, Order order) {
		super();
		this.id = id;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
		this.product = product;
		this.order = order;
	}

	public OrderDetailsId getId() {
		return id;
	}

	public void setId(OrderDetailsId id) {
		this.id = id;
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
		return "OrderDetail [id=" + id + ", quantityOrdered=" + quantityOrdered + ", priceEach=" + priceEach
				+ ", orderLineNumber=" + orderLineNumber + "]";
	}

}
