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

import com.org.entity.Admin;
import com.org.model.HibernateUtil;

@WebServlet("/alist")
public class AdminList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		List<Admin> list = session.createQuery("from Admin").list();
		PrintWriter out = response.getWriter();
		out.print("<h1>Admin List</h1><hr>");
		out.println("<table>");
		out.println("<tr><th>AdminId</th><th>Username</th><th>Password</th><tr>");
		for (Admin a : list) {
			out.print("<tr>");
			out.print("<td>" + a.getAid() + "</td>");
			out.print("<td>" + a.getUsername() + "</td>");
			out.print("<td>" + a.getPassword() + "</td>");
		}
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
