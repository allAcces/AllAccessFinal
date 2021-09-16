package com.all.access.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller  implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int shopid;
	@Column
	private String shopowner_name;
	@Column
	private String password;
	@Column
	private String shopowner_email;
	@Column
	private int shop_address_pincode;
	@Column
	private String shop_address_contact_number;
	@Column
	private String shop_address_email;
	@Column
	private String shop_name;
	@Column
	private String shop_timings;
	@Column
	private String shop_website;


	public Seller() {}


	public Seller(int shopid, String shopowner_name, String password, String shopowner_email, int shop_address_pincode,String shop_address_contact_number,String shop_address_email, String shop_name, String shop_timings, String shop_website) {
		super();
		this.shopid = shopid;
		this.shopowner_name = shopowner_name;
		this.password = password;
		this.shopowner_email = shopowner_email;
		this.shop_address_pincode = shop_address_pincode;
		this.shop_address_contact_number = shop_address_contact_number;
		this.shop_address_email = shop_address_email;
		this.shop_name = shop_name;
		this.shop_timings = shop_timings;
		this.shop_website = shop_website;
	}


	public int getShopid() {
		return shopid;
	}


	public void setShopid(int shopid) {
		this.shopid = shopid;
	}


	public String getShopowner_name() {
		return shopowner_name;
	}


	public void setShopowner_name(String shopowner_name) {
		this.shopowner_name = shopowner_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getShopowner_email() {
		return shopowner_email;
	}


	public void setShopowner_email(String shopowner_email) {
		this.shopowner_email = shopowner_email;
	}


	public int getShop_address_pincode() {
		return shop_address_pincode;
	}


	public void setShop_address_pincode(int shop_address_pincode) {
		this.shop_address_pincode = shop_address_pincode;
	}


	public String getShop_address_contact_number() {
		return shop_address_contact_number;
	}


	public void setShop_address_contact_number(String shop_address_contact_number) {
		this.shop_address_contact_number = shop_address_contact_number;
	}


	public String getShop_address_email() {
		return shop_address_email;
	}


	public void setShop_address_email(String shop_address_email) {
		this.shop_address_email = shop_address_email;
	}


	public String getShop_name() {
		return shop_name;
	}


	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}


	public String getShop_timings() {
		return shop_timings;
	}


	public void setShop_timings(String shop_timings) {
		this.shop_timings = shop_timings;
	}


	public String getShop_website() {
		return shop_website;
	}


	public void setShop_website(String shop_website) {
		this.shop_website = shop_website;
	}
}