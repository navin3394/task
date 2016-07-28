package com.niit.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class TestSupplier {
	
	public static void main(String args[]){
		
	
Product p1=new Product(111, "tv",30_000);
Product p2=new Product(112,"mob", 7_000);

	Supplier s1=new Supplier("333","sony","delhi");
	Supplier s2=new Supplier("334","samsung","goa");
	List<Product>productlist=new ArrayList<Product>();
	List<Supplier>supplierlist=new ArrayList<Supplier>();
	
	productlist.add(p1);
	productlist.add(p2);
	supplierlist.add(s1);
	supplierlist.add(s2);
	
	
	s1.setProductlist(productlist);
	p1.setSupplierlist(supplierlist);
	System.out.println("the details...");
	System.out.println(s1.getId());
	System.out.println(s1.getName());
	System.out.println(s1.getAddress());
	System.out.println("...........");
	
	List<Product>Products=s1.getProductlist();
	for(Product p: Products){
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println("......");
	
	}
	System.out.println("the details...");
	System.out.println(p1.getId());
	System.out.println(p1.getName());
	System.out.println(p1.getPrice());
	System.out.println("...........");
	List<Supplier>Suppliers=p1.getSupplierlist();
	for(Supplier s: Suppliers){
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println("......");
	
	}
	}

}
