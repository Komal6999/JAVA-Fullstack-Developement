package com.company.program;

import java.util.Scanner;

public class PercentageProgram {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks= scanner.nextInt();
		
		if(marks>70 && marks<=100)
		{
			System.out.println("Display Distinction");
		}
		else if(marks>60 && marks<=70)
		{
			System.out.println("First Class");
		}
		else if(marks>50 && marks<=60)
		{
			System.out.println("Second Class");
		}
		else if(marks>35 && marks<=50)
		{
			System.out.println("Pass Class");
		}
		else if(marks>0 && marks<=35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Kindly enter correct Result");
		}

	}

}
