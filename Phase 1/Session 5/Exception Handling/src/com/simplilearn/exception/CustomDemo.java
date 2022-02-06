package com.simplilearn.exception;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
 
class Test{
	public void display() throws MyException {
	  throw new MyException("This is a custom exception.");
	}
}
 
public class CustomDemo {
	public static void main(String args[]){
		//creating Test object.
		Test obj = new Test();
 
		//method call.
		try{
			obj.display();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
