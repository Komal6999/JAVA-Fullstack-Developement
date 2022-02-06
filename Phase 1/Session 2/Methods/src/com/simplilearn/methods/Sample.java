package com.simplilearn.methods;

import java.util.Scanner;

public class Sample {
	
	//Method with no return value, without parameter
	public void display() 
	{
		System.out.println("Welcome to JAVA");
	}
	
	//Method which will calculate some value and return a result
	public int add(int a,int b)
	{
		int num1=a+b;
		int num2=a*b;
		return num1+num2;
	}
	
	//Method to check use validity and return value true or false, one parameter
	public boolean valid(int age)
	{
		if(age>18)
			return true;
		else
			return false;
	}
	
	//Method to return fullname based on fname and lname, 2 parameterized
	
	public String fullname(String fname,String lname )
	{
		return fname+" "+lname;
	}
	public static void main(String[] args)
	{
		Sample s=new Sample();
		s.display();
		int result=s.add(2, 4);
		System.out.println("Result "+result);
		System.out.println(s.valid(67));
		System.out.println("My full name is "+s.fullname("Komal", "Patil"));
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int input= sc.nextInt();
		if(s.valid(input))
			System.out.println("Valid for vote");
		else
			System.out.println("Not valid");*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name");
		String result=sc.nextLine();*/
	}
}
