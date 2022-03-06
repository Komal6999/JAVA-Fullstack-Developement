package com.org.customercontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.model.HibernateUtil;

@WebServlet("/purcalc")
public class PurchaseCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		String passengers = request.getParameter("calc");
		int id2 = (int) request.getSession().getAttribute("id");
		int t = (int) request.getSession().getAttribute("price");
		int p = Integer.parseInt(passengers);
		int f = t * p;

		try {
			PreparedStatement stmt;

			stmt = conn.prepareStatement("select " + "CustomerDetails.Username,FlightDetails.FlightID,"
					+ "FlightDetails.AirlineName,FlightDetails.DateOpert,FlightDetails.Source,"
					+ "FlightDetails.Destination from ((OrderDetails "
					+ "inner join FlightDetails on OrderDetails.FlightID=FlightDetails.FlightID)"
					+ "inner join CustomerDetails on OrderDetails.CustomerID=CustomerDetails.CustomerID) "
					+ "where OrderDetails.CustomerID=?");

			stmt.setInt(1, id2);
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				
				out.print("<h1>Booking Details</h1><br>");
				out.print("Username: " + result.getString(1)+"<br>");
				out.print("FlightID: " + result.getInt(2)+"<br>");
				out.print("Airline Name: " + result.getString(3)+"<br>");
				out.print("Date: " + result.getDate(4)+"<br>");
				out.print("Source: " + result.getString(5)+"<br>");
				out.print("Destination: " + result.getString(6)+"<br>");
				out.print("Total fare: "+f);
				out.print("<br> <a href='customerdashboard.jsp'>Click here to go back to Dashboard</a> <br>");

				request.getSession().setAttribute("id2", result);
			}

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
