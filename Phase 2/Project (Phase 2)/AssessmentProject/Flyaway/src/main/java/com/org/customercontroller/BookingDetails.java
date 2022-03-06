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

import com.org.model.HibernateUtil;

@WebServlet("/bdetails")
public class BookingDetails extends HttpServlet {
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

		try {
			PreparedStatement stmt;

			stmt = conn.prepareStatement("select " + "CustomerDetails.Username,FlightDetails.FlightID,"
					+ "FlightDetails.AirlineName,FlightDetails.Source,FlightDetails.Destination,"
					+ "FlightDetails.DateOpert,FlightDetails.T_Price from ((OrderDetails "
					+ "inner join FlightDetails on OrderDetails.FlightID=FlightDetails.FlightID)"
					+ "inner join CustomerDetails on OrderDetails.CustomerID=CustomerDetails.CustomerID) "
					+ "where OrderDetails.CustomerID=?");

			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();

			out.print("<br> <a href='customerdashboard.jsp'>Click here to go back to Dashboard</a> <br>");	
			out.print("<h1>Booking Details</h1><hr>");
			out.println("<table>");
			out.println("<tr><th>Username</th><th>FlightID</th><th>AirlineName</th>"
					+ "<th>Source</th><th>Destination</th><th>DateOperating</th><th>TicketPrice</th><tr>");
			while (result.next()) {

				out.print("<tr>");
				out.print("<td>" + result.getString(1) + "</td>");
				out.print("<td>" + result.getInt(2) + "</td>");
				out.print("<td>" + result.getString(3) + "</td>");
				out.print("<td>" + result.getString(4) + "</td>");
				out.print("<td>" + result.getString(5) + "</td>");
				out.print("<td>" + result.getDate(6) + "</td>");
				out.print("<td>" + result.getInt(7) + "</td>");
			}
			out.print("</table>");

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
