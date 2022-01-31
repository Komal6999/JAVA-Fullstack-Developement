package com.company.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalProject {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your email id: ");
		String email = sc.next();
		
		//Regular expression to accept valid email id
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +
        		"(?:[a-zA-z0-9-]+\\.)+[a-zA-Z]{2,7}$"; 
		//creating a pattern object
		Pattern pattern = Pattern.compile(regex);
		//creating a Matcher object
		Matcher matcher = pattern.matcher(email);
		//verifying whether given email id is valid
		if(matcher.matches()) {
			System.out.println("Given email id is valid");
		}
		else {
			System.out.println("Given email id is not valid");
		}
	}
	
}