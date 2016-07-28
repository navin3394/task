package com.niit.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int id;
	private String name;
	private int price;
	private float weight;
	

	
	
	List<Supplier>supplierlist=new ArrayList<Supplier>();




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public float getWeight() {
		return weight;
	}




	public void setWeight(float weight) {
		this.weight = weight;
	}




	public List<Supplier> getSupplierlist() {
		return supplierlist;
	}




	public void setSupplierlist(List<Supplier> supplierlist) {
		this.supplierlist = supplierlist;
	}




	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}
