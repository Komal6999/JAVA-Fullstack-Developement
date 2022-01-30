package com.company.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	
	public static void main(String[] args) {
		String email1 = "komal.patil0609@gmail.com";
		String email2 = "bhushanpatil.com";
		String email3 = "kunalp&.com";
		String email4 = "pujadevkar06gmail.com";
		
			
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter User Email");
        String email = sc.nextLine();
		
        System.out.println("email = " + validateEmail(email));
        
	}
	
	public static String validateEmail (String email) {
		if(email == null || email.isEmpty()) {
			return "Invalid";
		}
		
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +
		"(?:[a-zA-z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		
		Pattern pattern = Pattern.compile(emailRegex);
		if (pattern.matcher(email).matches()) {
			return "Valid";
		}
		else {
			return "Invalid";
		}
		
		
		}

}
