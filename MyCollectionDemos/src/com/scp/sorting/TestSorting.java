package com.scp.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
public static void main(String[] args) {
	
	Product p1=new Product(10,"abc",200);
	Product p2=new Product(2,"ac",240);
	Product p3=new Product(32,"ab",260);
	Product p4=new Product(4,"bc",2030);
	Product p5=new Product(15,"a",2090);
	
	List<Product> listOfProduct= new ArrayList<Product>();
	
	listOfProduct.add(p1);
	listOfProduct.add(p2);
	listOfProduct.add(p3);
	listOfProduct.add(p4);
	listOfProduct.add(p5);
	
	System.out.println("Unsorted ......"+listOfProduct);
	Collections.sort(listOfProduct, p1.idCompare);
	System.out.println("Sorted ......"+listOfProduct);
}

}
