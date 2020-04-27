package pl.marcinblok.jpa.mysqlhibernatejava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "productlines")
public class ProductLine {

	@Id
	@Column(name = "productLine")
	private String productLineId;
	private String textDescription;
	private String htmlDescription; // mediumtext
	
	@Lob 
	@Column(length=16777215)
	private byte[] image; // mediumblob

	public ProductLine() {
	}

	public ProductLine(String productLineId, String textDescription, String htmlDescription, byte[] image) {
		super();
		this.productLineId = productLineId;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}

	public String getProductLineId() {
		return productLineId;
	}

	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ProductLines [productLineId=" + productLineId + ", textDescription=" + textDescription
				+ ", htmlDescription=" + htmlDescription + ", image=" + image + "]";
	}

}
