package pl.marcinblok.jpa.mysqlhibernatejava;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payments {

	@Id
	private Integer customerId;
	@Id
	@Column(name = "checkNumber")
	private String checkNumberId;
	private LocalDate paymentDate;
	private double amount;

	public Payments() {
	}

	public Payments(Integer customerId, String checkNumberId, LocalDate paymentDate, double amount) {
		super();
		this.customerId = customerId;
		this.checkNumberId = checkNumberId;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCheckNumberId() {
		return checkNumberId;
	}

	public void setCheckNumberId(String checkNumberId) {
		this.checkNumberId = checkNumberId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payments [customerNumberId=" + customerId + ", checkNumberId=" + checkNumberId + ", paymentDate="
				+ paymentDate + ", amount=" + amount + "]";
	}

}
