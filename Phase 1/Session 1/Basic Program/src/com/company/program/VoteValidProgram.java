package com.company.program;

import java.util.Scanner;

public class VoteValidProgram {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a age");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n>=18)
		{
			System.out.println("Possible");
		}
		else
		{
			System.out.println("Not possible");
		}

	}

}
