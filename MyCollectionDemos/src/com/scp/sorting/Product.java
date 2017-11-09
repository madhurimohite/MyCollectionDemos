package com.scp.sorting;

import java.util.Comparator;

public class Product {
public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
int id;
@Override
public String toString() {
	return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + "]";
}
String name;
int price;
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

Comparator<Product> idCompare=new Comparator<Product>() {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getId()-p2.getId();
	}
};
}
