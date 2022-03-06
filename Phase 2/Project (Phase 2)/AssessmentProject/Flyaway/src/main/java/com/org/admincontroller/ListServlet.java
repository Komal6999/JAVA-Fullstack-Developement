package com.org.admincontroller;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.org.entity.Flight;
import com.org.model.HibernateUtil;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		List<Flight> list = session.createQuery("from Flight").list();
		PrintWriter out = response.getWriter();
		out.print("<br> <a href='admindashboard.jsp'>Click here to go back to Dashboard</a> <br>");	
		out.print("<h1>Flight List</h1><hr>");
		out.println("<table>");
		out.println(
				"<tr><th>FlightId</th><th>AirlineName</th><th>DateOperating</th><th>Source</th><th>Destination</th><th>TicketPrice</th><th>"
						+ " " + "</th><tr>");
		for (Flight f : list) {
			out.print("<tr>");
			out.print("<td>" + f.getFid() + "</td>");
			out.print("<td>" + f.getAname() + "</td>");
			out.print("<td>" + f.getDate() + "</td>");
			out.print("<td>" + f.getSrc() + "</td>");
			out.print("<td>" + f.getDest() + "</td>");
			out.print("<td>" + f.getPrice() + "</td>");
			out.print("<td>" + " <a href='delete?id=" + f.getFid() + "'>Delete</a> | <a href='updatefdetails.jsp?id="
					+ f.getFid() + "'>Update</a>" + "</td>");
		}
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
