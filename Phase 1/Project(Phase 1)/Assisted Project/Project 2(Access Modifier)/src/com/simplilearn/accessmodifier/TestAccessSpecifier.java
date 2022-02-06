package com.simplilearn.accessmodifier;

public class TestAccessSpecifier {

	public static void main(String[] args) {
		
		//Default Accessible in same Package
		
		DefAccessSpecifier def = new DefAccessSpecifier();
		def.display();
		
		//Access Private Variable in another class

		PrivateAccessSpecifier obj= new PrivateAccessSpecifier();
		//System.out.println("Value of a" +obj.a);

		AccessSpecifier obj2= new AccessSpecifier();
		obj2.display();
	}

}

