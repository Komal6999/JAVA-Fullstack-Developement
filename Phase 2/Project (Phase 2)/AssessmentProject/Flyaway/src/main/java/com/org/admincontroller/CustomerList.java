package com.org.admincontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.org.entity.Customer;
import com.org.model.HibernateUtil;

@WebServlet("/clist")
public class CustomerList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		List<Customer> list = session.createQuery("from Customer").list();
		PrintWriter out = response.getWriter();
		out.print("<h1>Customer List</h1><hr>");
		out.println("<table>");
		out.println("<tr><th>CustomerId</th><th>Username</th><th>Age</th><th>CityofResidence</th><tr>");
		for (Customer c : list) {
			out.print("<tr>");
			out.print("<td>" + c.getCid() + "</td>");
			out.print("<td>" + c.getUsername() + "</td>");
			out.print("<td>" + c.getAge() + "</td>");
			out.print("<td>" + c.getCityofResidence() + "</td>");
		}
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
