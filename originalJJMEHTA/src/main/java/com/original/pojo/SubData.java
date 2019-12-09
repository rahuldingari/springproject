package com.original.pojo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.org.apache.xml.internal.security.utils.Base64;
@Entity
@Table(name="products")
public class SubData {
	@Id
	@Column
	private int prod_id;
	@Column
	private double prize;
	@Column
	private int quantity;
	@Column
	private byte[] image;
	@Column
	private String pro_type;
	@Column
	private String pro_brand;

	public String getPro_brand() {
		return pro_brand;
	}

	public void setPro_brand(String pro_brand) {
		this.pro_brand = pro_brand;
	}

	public String getPro_type() {
		return pro_type;
	}

	public void setPro_type(String pro_type) {
		this.pro_type = pro_type;
	}


	private String base64;

	

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getBase64() {
		return this.base64 = Base64.encode(this.image);
	}


	public void setBase64(String base64) {
		this.base64 = base64;
	}
}