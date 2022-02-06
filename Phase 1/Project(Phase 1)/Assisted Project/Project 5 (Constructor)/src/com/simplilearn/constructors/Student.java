package com.simplilearn.constructors;

public class Student {

	public String id;
	public String name;
	//default constructor
	public Student()
	{
		System.out.println("Students object created");
	}
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// When you create object automatically it calls deafult constructors
		//if no default constructor then compiler will create that
		Student obj= new Student();

	}

}
