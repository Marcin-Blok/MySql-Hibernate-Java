package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetails {

	@Column(name="orderNumber")
	private Integer orderNumberId;
	
	@Column(name="productCode")
	private String productCodeId;
	
}
