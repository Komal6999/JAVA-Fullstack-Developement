package com.simplilearn.constructors;

public class DefaultConstructor {
	
	int id;
	
	String name;
	//method to display the value of id and name
	
	void display() {
		System.out.println(id+""+name);
	}

	public static void main(String[] args)
	{
		//creating objects
		
		DefaultConstructor s1 =new DefaultConstructor();
		DefaultConstructor s2=new DefaultConstructor();
		
		//displaying values of the objects
		
		s1.display();
		s2.display();
	}
}
