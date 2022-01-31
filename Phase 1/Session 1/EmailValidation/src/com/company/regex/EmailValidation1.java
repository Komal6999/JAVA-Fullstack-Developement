package com.company.regex;

import java.util.regex.*;    
import java.util.*;    
public class EmailValidation1{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("komal.patil0609#gmail.co.in");  
        emails.add("komal.patil0609@gmail.com");  
        emails.add("komalpatil.name&gmail.com");  
        emails.add("komalpatil#@gmail.co.in");   
        emails.add("komalpatil*gmailcom");  
        
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("komalpatil#gmail.com");  
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter User Email");
        String email = sc.nextLine();
		
        System.out.println("email = " + validateEmail(email));
        
        //Regular Expression   
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +
        		"(?:[a-zA-z0-9-]+\\.)+[a-zA-Z]{2,7}$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email1 : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email1);  
            System.out.println(email1 +" : "+ matcher.matches()+"\n");  
        }  
    }

	private static String validateEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}  
}  