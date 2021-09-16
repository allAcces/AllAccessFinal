package com.all.access.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Products")
public class Products 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productId;
	@Column
	private String productTitle;
	@Column
	private float price;
	@Column(name="manufacturingdate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date productManufacturingDate;
	@Column
	private float vat;
	@Column
	private float discount;
	@Column
	private int stock;
	
	public Products() {}
	
	public Products(int productId, String productTitle, float price, Date productManufacturingDate, float vat,
			float discount, int stock) {
		this.productId = productId;
		this.productTitle = productTitle;
		this.price = price;
		this.productManufacturingDate = productManufacturingDate;
		this.vat = vat;
		this.discount = discount;
		this.stock = stock;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getProductManufacturingDate() {
		return productManufacturingDate;
	}

	public void setProductManufacturingDate(Date productManufacturingDate) {
		this.productManufacturingDate = productManufacturingDate;
	}

	public float getVat() {
		return vat;
	}

	public void setVat(float vat) {
		this.vat = vat;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
}
