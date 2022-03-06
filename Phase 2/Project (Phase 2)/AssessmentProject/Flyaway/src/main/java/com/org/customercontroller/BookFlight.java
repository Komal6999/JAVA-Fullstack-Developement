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

@WebServlet("/book")
public class BookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		String source = request.getParameter("src");
		String destination = request.getParameter("dest");
		String date1 = request.getParameter("date");

		try {
			PreparedStatement stmt = conn
					.prepareStatement("select * from FlightDetails where Source=? and Destination=? and DateOpert=?");
			stmt.setString(1, source);
			stmt.setString(2, destination);
			stmt.setString(3, date1);
			ResultSet result = stmt.executeQuery();

			out.print("<h1>Flight Details</h1><hr>");
			out.println("<table>");
			out.println("<tr><th>FlightID</th><th>AirlineName</th><th>DateOperating</th>"
					+ "<th>Source</th><th>Destination</th><th>TicketPrice</th><tr>");
			while (result.next()) {
				int id = result.getInt(1);

				out.print("<tr>");
				out.print("<td>" + id + "</td>");
				out.print("<td>" + result.getString(2) + "</td>");
				out.print("<td>" + result.getDate(3) + "</td>");
				out.print("<td>" + result.getString(4) + "</td>");
				out.print("<td>" + result.getString(5) + "</td>");
				out.print("<td>" + result.getBigDecimal(6) + "</td>");
				out.print("<td>" + "<a href='orderd?id=" + id + "'>Book Now</a>");
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
