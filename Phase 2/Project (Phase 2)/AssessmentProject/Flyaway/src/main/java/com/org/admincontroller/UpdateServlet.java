package com.org.admincontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.model.HibernateUtil;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		String id = (String) request.getSession().getAttribute("fid");

		String name = request.getParameter("aname");
		String d = request.getParameter("date");
		String source = request.getParameter("src");
		String destination = request.getParameter("dest");
		String price = request.getParameter("price");

		try {
			session.beginTransaction();

			PreparedStatement stmt = conn.prepareStatement("update FlightDetails set AirlineName=? , "
					+ "DateOpert=? , Source=? , Destination=? , T_Price=? where FlightID=?");
			stmt.setString(1, name);
			stmt.setString(2, d);
			stmt.setString(3, source);
			stmt.setString(4, destination);
			stmt.setBigDecimal(5, new BigDecimal(price));
			stmt.setInt(6, Integer.parseInt(id));

			int x = stmt.executeUpdate();
			if (x > 0) {
				out.print("<body background='https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg'>");
				out.print("<font color='white'>");
				out.print("Data Updated Successfully");
				out.print("</font>");
				out.print(
						"<br> <a href='list'><font color='white'>Click here to view updated flight details</font></a><br>");
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