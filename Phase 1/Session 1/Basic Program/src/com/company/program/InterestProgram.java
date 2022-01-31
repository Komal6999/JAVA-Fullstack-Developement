package com.company.program;

import java.util.Scanner;

public class InterestProgram {

	public static void main(String[] args) {
		float p,r,t,si;
		/*p=15000; r=5; t=3;
		 * s=(p*r*t)/100;
		 * System.out.println("SI is:" +s);*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Principal:");
		p=s.nextFloat();
		System.out.println("Enter the Rate of Interest:");
		r=s.nextFloat();
		System.out.println("Enter the Time Period:");
		t=s.nextFloat();
		si=(r*t*p)/100;
		System.out.println("The SI is:" +si);

	}

}
