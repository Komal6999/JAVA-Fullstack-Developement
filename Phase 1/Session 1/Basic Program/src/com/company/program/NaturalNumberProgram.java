// Java Program to Print Natural Numbers from 1 to N

package com.company.program;

import java.util.Scanner;

public class NaturalNumberProgram {
	private static Scanner sc;

	public static void main(String[] args) {
		
		int number, i;
		sc= new Scanner(System.in);
		
		System.out.println("Please Enter any Number :");
		number = sc.nextInt();
		
		for(i=1;i<= number;i++)
		{
			System.out.println(i+ "\t");
		}

	}

}
