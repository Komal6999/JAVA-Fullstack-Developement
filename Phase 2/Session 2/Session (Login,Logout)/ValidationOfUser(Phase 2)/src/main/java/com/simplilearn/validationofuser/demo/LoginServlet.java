package com.simplilearn.validationofuser.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		
		String username= req.getParameter("username");
		String password= req.getParameter("password");
		

		if(username.equals("komalPatil")) {
			if(password.equals("Komal123")) {
				out.print("Valid User !!!!!!!!!!!!!!!!!!!!!!!\n\n");
				
				out.print("Welcome "+username);
				out.print("\n your password is "+password);
			}	else {
				out.print("Password Incorrect");
	
			}		
			}else {
				out.print("Invalid Username and Password");
			}
	}
}
