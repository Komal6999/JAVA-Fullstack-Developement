package com.org.customercontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.entity.Customer;
import com.org.entity.Flight;
import com.org.entity.Order;
import com.org.model.HibernateUtil;

@WebServlet("/orderd")
public class OrderDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		try {
			session.beginTransaction();

			int fid = Integer.parseInt(request.getParameter("id"));
			int cid = (int) request.getSession().getAttribute("id1");

			Flight f = new Flight();
			f.setFid(fid);
			Customer c = new Customer();
			c.setCid(cid);

			Order o = new Order();
			o.setFid(f);
			o.setCid(c);
			session.save(o);
			session.getTransaction().commit();

			request.getSession().setAttribute("id", cid);
			request.getSession().setAttribute("id1", fid);
			response.sendRedirect("view");
			session.close();
			// return;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
