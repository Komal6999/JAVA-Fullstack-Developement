package com.simplilearn.projects;

public class DemoTypeCasting {

	public static void main(String[] args) {
		// Implicit Conversion
		
		System.out.println("Implicit type Casting");
		char a='K';
		System.out.println("Value of a " +a);
		
		int b=a;
		System.out.println("Value of Int " +b);
		
		long c=b;
		System.out.println("Value of Long " +c);
		
		float d=c;
		System.out.println("Value of Float " +d);
	
		
		double e=d;
		System.out.println("Value of double " +e);
		
		//Explicit Conversion
		
		System.out.println("Explicit type Casting");
		double x=89.90;
		int y=(int) x;
		System.out.println("Value of x " +x);
		System.out.println("Value of y " +y);
		
		float result=45.0f/7;
		System.out.println("Value of result " +result);
	}

}

