package com.simplilearn.innerclass;

public class MethodLocalInnerClass {

	public void display()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("Method from Inner Class");
			}
		}
		
		Inner inner=new Inner();
		inner.myMethod();
	}
	
	public static void main(String[] args) {
		
		MethodLocalInnerClass mlic=new MethodLocalInnerClass();
		mlic.display();
	}
}
