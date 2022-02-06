//Calculator Program using Loop

package com.simplilearn.calculator;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner inputNum1 = new Scanner(System.in);
		Scanner inputNum2 = new Scanner(System.in);
		Scanner inputOp = new Scanner(System.in);
		double num1, num2;
		String op;
		while (true)
		{
			System.out.println("First number: ");
			num1 = inputNum1.nextDouble();
			System.out.println("Second number: ");
			num2 = inputNum2.nextDouble();
			System.out.println("Operator: ");
			op = inputOp.next();
			
			if(op.equals("+"))
			{
				System.out.println(num1 + num2);
			}
			else if (op.equals("-"))
			{
				System.out.println(num1-num2);
			}
			else if(op.equals("*"))
			{
				System.out.println(num1*num2);
			}
			else if(op.equals("/"))
			{
				System.out.println(num1/num2);
			}
		
				}

	}

}

