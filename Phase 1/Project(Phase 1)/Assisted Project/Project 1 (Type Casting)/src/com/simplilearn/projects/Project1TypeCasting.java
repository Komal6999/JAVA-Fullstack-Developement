package com.simplilearn.projects;

public class Project1TypeCasting {

	public static void main(String[] args) {
		
		//1- Widening Casting -> auto
		//byte -> short -> char -> int -> long -> float -> double
		byte c = 127;
		int a =c;
		double b =c;
		System.out.println(a);
		System.out.println(b);
		
		//2- Narrowing Casting -> Manual
		//double ->> float ->> long ->> int ->> char ->> short ->> byte
		
		double d = 3.14;
		int i = (int)d;
		long l = (long)d;
		
		System.out.println("double to int " +i);
		System.out.println("double to long " +l);
	
		//String -> int, double, long, byte....
		String s= "3.14";
		double sDoub = Double.valueOf(s);
		double sumDoub = sDoub +3.1;
		System.out.println("String -> double" +sDoub);
		System.out.println("Sum Double: " + sumDoub);
		
		String s1 = "127";
		int sInt = Integer.valueOf(s1);
		System.out.println("String -->> Int " + sInt);
		
		 byte sByte = Byte.valueOf(s1);
		System.out.println("String -->> Byte " + sByte);
		
	    float sFloat = Float.valueOf(s1);
		System.out.println("String -->> Float " + sFloat);
		
		//int, long, short, double,....->> String
		long num = 1234;
		String stNum = String.valueOf(num);
		System.out.println("long ->> String " + (stNum + 123));
	}

}
