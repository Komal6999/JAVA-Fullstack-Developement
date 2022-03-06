package com.org.admincontroller;

import java.io.IOException;
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

@WebServlet("/alogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		String name = request.getParameter("aname");
		String password = request.getParameter("pass");
		int flag = 0;

		List<Admin> list = session.createQuery("from Admin").list();
		for (Admin a : list) {
			if (name.equals(a.getUsername()) && password.equals(a.getPassword())) {
				flag = 1;
				request.getSession().setAttribute("uname", a.getUsername());
				response.sendRedirect("admindashboard.jsp");
				return;
			}
		}

		if (flag == 0) {
			response.sendRedirect("error.jsp");
			return;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
