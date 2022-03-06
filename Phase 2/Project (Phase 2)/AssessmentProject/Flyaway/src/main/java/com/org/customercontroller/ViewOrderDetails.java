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

@WebServlet("/view")
public class ViewOrderDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		int cid = (int) request.getSession().getAttribute("id");
		int fid = (int) request.getSession().getAttribute("id1");

		try {
			PreparedStatement stmt;

			stmt = conn
					.prepareStatement("select " + "CustomerDetails.Username,CustomerDetails.Age,FlightDetails.FlightID,"
							+ "FlightDetails.AirlineName,FlightDetails.DateOpert,FlightDetails.Source,"
							+ "FlightDetails.Destination,FlightDetails.T_Price from ((OrderDetails "
							+ "inner join FlightDetails on OrderDetails.FlightID=FlightDetails.FlightID)"
							+ "inner join CustomerDetails on OrderDetails.CustomerID=CustomerDetails.CustomerID) "
							+ "where OrderDetails.CustomerID=? and OrderDetails.FlightID=?");

			stmt.setInt(1, cid);
			stmt.setInt(2, fid);
			ResultSet result = stmt.executeQuery();

			out.print("<h1>Order Details</h1><hr>");
			out.println("<table>");
			out.println("<tr><th>CustomerUsername</th>" + "<th>CustomerAge</th><th>FlightID</th>"
					+ "<th>AirlineName</th><th>DateOperating</th><th>Source</th>"
					+ "<th>Destination</th><th>TicketPrice</th><tr>");
			while (result.next()) {
				int p = result.getInt(8);

				out.print("<tr>");
				out.print("<td>" + result.getString(1) + "</td>");
				out.print("<td>" + result.getInt(2) + "</td>");
				out.print("<td>" + result.getInt(3) + "</td>");
				out.print("<td>" + result.getString(4) + "</td>");
				out.print("<td>" + result.getDate(5) + "</td>");
				out.print("<td>" + result.getString(6) + "</td>");
				out.print("<td>" + result.getString(7) + "</td>");
				out.print("<td>" + p + "</td>");

				request.getSession().setAttribute("id1", cid);
				request.getSession().setAttribute("price", p);
			}
			out.print("</table>");

			out.print("<br><a href='purchase.jsp'>Click here to confirm and proceed to Purchase</a><br>");
			// response.sendRedirect("purchase.jsp");
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
