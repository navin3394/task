package com.niit.ecommerce;

import java.util.ArrayList;
import java.util.List;


public class Supplier {
private String id;
private String name;
private String address;
private Product products;

List<Product>productlist=new ArrayList<Product>();

public Supplier(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Product getProducts() {
	return products;
}

public void setProducts(Product products) {
	this.products = products;
}

public List<Product> getProductlist() {
	return productlist;
}

public void setProductlist(List<Product> productlist) {
	this.productlist = productlist;
}
}