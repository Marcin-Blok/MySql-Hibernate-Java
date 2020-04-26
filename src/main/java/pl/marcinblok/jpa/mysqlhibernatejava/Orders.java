package pl.marcinblok.jpa.mysqlhibernatejava;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	@Column(name = "orderNumber")
	private Integer orderNumberId;
	private LocalDate orderDate;
	private LocalDate requiredDate;
	private LocalDate shippedDate;
	private String status;
	private String comments;
	private Integer customerId;

	public Orders() {
	}

	public Orders(Integer orderNumberId, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate,
			String status, String comments, Integer customerId) {
		super();
		this.orderNumberId = orderNumberId;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.customerId = customerId;
	}

	public Integer getOrderNumberId() {
		return orderNumberId;
	}

	public void setOrderNumberId(Integer orderNumberId) {
		this.orderNumberId = orderNumberId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(LocalDate requiredDate) {
		this.requiredDate = requiredDate;
	}

	public LocalDate getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(LocalDate shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Orders [orderNumber=" + orderNumberId + ", orderDate=" + orderDate + ", requiredDate=" + requiredDate
				+ ", shippedDate=" + shippedDate + ", status=" + status + ", comments=" + comments
				+ ", customerNumberId=" + customerId + "]";
	}

}
