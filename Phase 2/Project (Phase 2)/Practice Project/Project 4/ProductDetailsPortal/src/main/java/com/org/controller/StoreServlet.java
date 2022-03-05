package com.org.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.org.model.HibernateUtil;

@WebServlet("/store")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		String name=request.getParameter("pname");
		String price=request.getParameter("price");
		Product p=new Product();
		p.setName(name);
		p.setPrice(new BigDecimal(price));
		p.setDateAdded(Calendar.getInstance().getTime());
		session.save(p);
		session.getTransaction().commit();
		response.sendRedirect("success.jsp");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}