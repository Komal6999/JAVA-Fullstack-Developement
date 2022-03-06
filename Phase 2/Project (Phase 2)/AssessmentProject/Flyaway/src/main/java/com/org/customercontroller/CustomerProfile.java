package com.org.customercontroller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.model.HibernateUtil;

@WebServlet("/profile")
public class CustomerProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		int id = (int) request.getSession().getAttribute("id");

		try {
			PreparedStatement stmt = conn.prepareStatement("select * from CustomerDetails where CustomerID=?");
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();

			out.print("<br> <a href='customerdashboard.jsp'>Click here to go back to Dashboard</a> <br>");	
			out.print("<h1>Customer Details</h1><hr>");
			out.println("<table>");
			out.println("<tr><th>Username</th><th>Password</th><th>Age</th><th>CityofResidence</th><tr>");
			while (result.next()) {
				out.print("<tr>");
				out.print("<td>" + result.getString(2) + "</td>");
				out.print("<td>" + result.getString(3) + "</td>");
				out.print("<td>" + result.getInt(4) + "</td>");
				out.print("<td>" + result.getString(5) + "</td>");
				out.print("<td>" + "<a href='cupdatedetails.jsp?id=" + result.getInt(1) + "'>Update</a>");

				request.getSession().setAttribute("id1", result.getInt(1));
			}
			out.print("</table>");

			out.print("<br><br> <a href='bdetails'>Click here to view all Booking Details</a>");
			out.print("<br><br> <a href='changepasswordcust.jsp'>Click here to change password</a>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
