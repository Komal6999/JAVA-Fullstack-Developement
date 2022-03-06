<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body background="https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg">
<font color="white">
<table>
	<tr><th>	</th><th><h1>Welcome User <%= request.getSession().getAttribute("uname") %></h1></th><tr>
		<tr>
			<td><h2>Options</h2></td>	
		</tr>
		<tr>
			<td><a href="profile"><font color="white">Click here to view profile</font></a></td>
		</tr>
		<tr>
			<td><a href="bookflight.jsp"><font color="white">Click here to book a flight</font></a></td>
		</tr>
		<tr>
			<td><a href="lout"><font color="white">Click here to logout</font></a></td>
		</tr>
</table>
</font>
</body>
</html>