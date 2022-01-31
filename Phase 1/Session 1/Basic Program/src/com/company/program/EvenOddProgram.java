package com.company.program;
import java.util.Scanner;

public class EvenOddProgram {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a Number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
