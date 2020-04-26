package pl.marcinblok.jpa.mysqlhibernatejava;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payments {

	@Id
	@Column(name = "checkNumber")
	private String checkNumberId;
	private Integer customerId;
	private LocalDate paymentDate;
	private double amount;

	public Payments() {
	}

	public Payments(String checkNumberId, Integer customerId, LocalDate paymentDate, double amount) {
		super();
		this.checkNumberId = checkNumberId;
		this.customerId = customerId;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public String getCheckNumberId() {
		return checkNumberId;
	}

	public void setCheckNumberId(String checkNumberId) {
		this.checkNumberId = checkNumberId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
		return "Payments [checkNumberId=" + checkNumberId + ", customerId=" + customerId + ", paymentDate="
				+ paymentDate + ", amount=" + amount + "]";
	}
	

}
