package com.org.admincontroller;

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

@WebServlet("/olist")
public class OrderList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		try {
			PreparedStatement stmt;

			stmt = conn.prepareStatement("select OrderDetails.OrderID,"
					+ "CustomerDetails.CustomerID,CustomerDetails.Username,CustomerDetails.Age,"
					+ "CustomerDetails.CityofResidence,FlightDetails.FlightID,FlightDetails.AirlineName,"
					+ "FlightDetails.DateOpert,FlightDetails.Source,FlightDetails.Destination,"
					+ "FlightDetails.T_Price from ((OrderDetails "
					+ "inner join FlightDetails on OrderDetails.FlightID=FlightDetails.FlightID)"
					+ "inner join CustomerDetails on OrderDetails.CustomerID=CustomerDetails.CustomerID)");

			ResultSet result = stmt.executeQuery();

			out.print("<h1>Order Details</h1><hr>");
			out.println("<table>");
			out.println("<tr><th>OrderId</th><th>CustomerID</th><th>CustomerUsername</th>"
					+ "<th>CustomerAge</th><th>CustomerCityofResidence</th><th>FlightID</th>"
					+ "<th>AirlineName</th><th>DateOperating</th><th>Source</th>"
					+ "<th>Destination</th><th>TicketPrice</th><tr>");
			while (result.next()) {

				out.print("<tr>");
				out.print("<td>" + result.getInt(1) + "</td>");
				out.print("<td>" + result.getInt(2) + "</td>");
				out.print("<td>" + result.getString(3) + "</td>");
				out.print("<td>" + result.getInt(4) + "</td>");
				out.print("<td>" + result.getString(5) + "</td>");
				out.print("<td>" + result.getInt(6) + "</td>");
				out.print("<td>" + result.getString(7) + "</td>");
				out.print("<td>" + result.getDate(8) + "</td>");
				out.print("<td>" + result.getString(9) + "</td>");
				out.print("<td>" + result.getString(10) + "</td>");
				out.print("<td>" + result.getInt(11) + "</td>");

			}
			out.print("</table>");

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
