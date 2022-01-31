package com.company.program;
import java.util.Scanner;

public class DivisibilityProgram {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter any Number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n % 5==0)
		{
			System.out.println("Divisible by 5");
		}
		else
		{
			System.out.println("Not Divisible by 5");
		}

	}

}
