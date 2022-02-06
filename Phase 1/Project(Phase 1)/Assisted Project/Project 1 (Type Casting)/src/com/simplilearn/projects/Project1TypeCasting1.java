package com.simplilearn.projects;

import java.util.Scanner;

public class Project1TypeCasting1 {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str= sc.nextLine();
		
		
		int a = Integer.parseInt(str);
		System.out.println("String converted into Integer type "+a);
		
		long l = Long.parseLong(str);
		System.out.println("String converted into long type "+l);

		
		float f = Float.parseFloat(str);
		System.out.println("String converted into float type "+f);

		
		double d = Double.parseDouble(str);
		System.out.println("String converted into double type "+d);

		
	}

}
