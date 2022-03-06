package com.org.customercontroller;

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

@WebServlet("/clogin")
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		PrintWriter out = response.getWriter();

		String name = request.getParameter("cname");
		String password = request.getParameter("pass");
		int flag = 0;

		List<Customer> list = session.createQuery("from Customer").list();
		for (Customer c : list) {
			if (name.equals(c.getUsername()) && password.equals(c.getPassword())) {
				flag = 1;
				request.getSession().setAttribute("id", c.getCid());
				request.getSession().setAttribute("uname", c.getUsername());
				response.sendRedirect("customerdashboard.jsp");
				return;
			}
		}

		if (flag == 0) {
			response.sendRedirect("err.jsp");
			return;
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
