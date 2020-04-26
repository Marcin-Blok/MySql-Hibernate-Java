package pl.marcinblok.jpa.mysqlhibernatejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductLines {

	@Id
	@Column(name = "productLine")
	private String productLineId;
	private String textDescription;
	private String htmlDescription; // mediumtext
	private Integer image; // mediumblob

	public ProductLines() {
	}

	public ProductLines(String productLineId, String textDescription, String htmlDescription, Integer image) {
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

	public Integer getImage() {
		return image;
	}

	public void setImage(Integer image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ProductLines [productLineId=" + productLineId + ", textDescription=" + textDescription
				+ ", htmlDescription=" + htmlDescription + ", image=" + image + "]";
	}

}
