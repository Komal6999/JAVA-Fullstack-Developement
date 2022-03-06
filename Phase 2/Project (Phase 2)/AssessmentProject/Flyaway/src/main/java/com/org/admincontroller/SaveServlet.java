package com.org.admincontroller;


import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
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

import com.org.entity.Flight;
import com.org.model.HibernateUtil;

@WebServlet("/save")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		String airlinename = request.getParameter("aname");
		String date1 = request.getParameter("date");
		String source = request.getParameter("src");
		String destination = request.getParameter("dest");
		String price = request.getParameter("price");

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			Date dateob = formatter.parse(date1);

			Flight f = new Flight();
			f.setAname(airlinename);
			f.setDate(dateob);
			f.setSrc(source);
			f.setDest(destination);
			f.setPrice(new BigDecimal(price));
			session.save(f);
			session.getTransaction().commit();
			session.close();
			response.sendRedirect("flightsuccess.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
