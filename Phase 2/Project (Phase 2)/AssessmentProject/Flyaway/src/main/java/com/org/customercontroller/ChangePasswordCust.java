package com.org.customercontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.model.HibernateUtil;

@WebServlet("/cpass")
public class ChangePasswordCust extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		int id = (int) request.getSession().getAttribute("id1");
		String npass = request.getParameter("newpass");

		try {
			session.beginTransaction();

			PreparedStatement stmt = conn.prepareStatement("update CustomerDetails set Password=? where CustomerID=?");
			stmt.setString(1, npass);
			stmt.setInt(2, id);

			int x = stmt.executeUpdate();
			if (x > 0) {
				out.print("<body background='https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg'>");
				out.print("<font color='white'>");
				out.print("Password Updated Successfully");
				out.print("</font>");
				out.print(
						"<br> <a href='customerlogin.jsp'><font color='white'>Click here to login again</font></a><br>");
			} else {
				out.print("<body background='https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg'>");
				out.print("<font color='white'>");
				out.print("Error while updating a data");
				out.print("</font>");
			}

			session.getTransaction().commit();
			session.close();

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
