package com.original.pojo;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class Products
{
	private int product_id;
	private String product_name;
	private byte[] prduct_image;
	private double  porduct_price;
	private int product_quantity;
	private String product_type;
	private String base64Image;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public byte[] getPrduct_image() {
		return prduct_image;
	}
	public void setPrduct_image(byte[] prduct_image) {
		this.prduct_image = prduct_image;
	}
	public double getPorduct_price() {
		return porduct_price;
	}
	public void setPorduct_price(double porduct_price) {
		this.porduct_price = porduct_price;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getBase64Image() {
		return this.base64Image=Base64.encode(this.prduct_image);
	}
	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}
	
}
