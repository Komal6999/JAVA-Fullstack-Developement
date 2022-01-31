package com.company.regex;

import java.util.regex.Pattern;

public class ValidationOfEmail {
	
	public static void main(String[] args) {
		String email1 = "komal.patil0609@gmail.com";
		String email2 = "komalpatil.com";
		
		System.out.println("email1 = " + validateEmail(email1));
		System.out.println("email2 = " + validateEmail(email2));
		    
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
