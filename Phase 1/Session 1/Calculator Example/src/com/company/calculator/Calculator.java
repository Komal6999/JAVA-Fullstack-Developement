// Calculator Program
package com.company.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double value1, value2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Value");
        value1 = sc.nextDouble();
		System.out.println("Enter the Second Value");
		value2= sc.nextDouble();
		System.out.println("Enter the operation as: + - * /");
		String operand = sc.next();
		
		double result= 0;
		
		switch(operand)
		{
		case "+":
			result= value1+value2;
			break;
		case "-":
			result= value1-value2;
			break;
		case "*":
			result= value1*value2;
			break;
		case "/":
			result= value1/value2;
			break;
		default:
			result=0;
		}
		System.out.println("The result of operation is" +result);

	}

}
