package com.company.lvc;

public class PrivateAccessSpecifier {

	private int a=23;
	
	public static void main(String[] args) {
		PrivateAccessSpecifier obj= new PrivateAccessSpecifier();
		System.out.println("Value of a" +obj.a);

	}

}
