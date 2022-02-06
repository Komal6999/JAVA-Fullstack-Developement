package com.simplilearn.exception;


public class TestCustomeException {

	void check(int age) throws NotValidException
	{
		if(age<18)
			throw new NotValidException("Age is less than 18");
		else
			System.out.println("Valid");
	}
	
	public static void main(String[] args) throws NotValidException {
		
		TestCustomeException t=new TestCustomeException();
		
		t.check(67);
	}
}
