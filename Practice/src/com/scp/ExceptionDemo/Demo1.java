package com.scp.ExceptionDemo;

public class Demo1 {

	public static void main(String[] args) {
 
	try {
		System.out.println("Try");
		int i= 10/0;
	}
	catch(Exception e){
		System.out.println("Catch");
	}
	finally {
		return;
	}
		
	
	}	
}
