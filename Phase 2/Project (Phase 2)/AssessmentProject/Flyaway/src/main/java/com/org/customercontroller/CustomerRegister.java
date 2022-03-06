package com.org.customercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.org.entity.Customer;
import com.org.model.HibernateUtil;

@WebServlet("/cregister")
public class CustomerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();

			String name = request.getParameter("cname");
			String password = request.getParameter("pass");
			int age = Integer.parseInt(request.getParameter("age"));
			String city = request.getParameter("cr");

			Customer c = new Customer();
			c.setUsername(name);
			c.setPassword(password);
			c.setAge(age);
			c.setCityofResidence(city);
			session.save(c);
			session.getTransaction().commit();
			session.close();
			response.sendRedirect("registersuccess.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
