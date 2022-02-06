package com.simplilearn.exception;

public class ThrowDemo1 {

		//my created method throwing exception
		//throwing unchecked exception
		void check(int age)
		{
			if(age<18)
				throw new ArithmeticException("Age is not valid for vote");
			else
				System.out.println("Valid");
		}
		
		public static void main(String[] args) {
			ThrowDemo1 t=new ThrowDemo1();
			//handle exception try catch
			
			try {
				t.check(8);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		}
	}

