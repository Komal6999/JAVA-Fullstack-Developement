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
			<td><a href="list"><font color="white">Click here to view Flight details</font></a></td>
		</tr>
		<tr>
			<td><a href="addflights.jsp"><font color="white">Click here to add Flight details</font></a></td>
		</tr>
		<tr>
			<td><a href="alist"><font color="white">Click here to view Admin details</font></a></td>
		</tr>
		<tr>
			<td><a href="clist"><font color="white">Click here to view Customer details</font></a></td>
		</tr>
		<tr>
			<td><a href="olist"><font color="white">Click here to view Order details</font></a></td>
		</tr>
		<tr>
			<td><a href="changepassword.jsp"><font color="white">Click here to change password</font></a></td>
		</tr>
		<tr>
			<td><a href="logout"><font color="white">Click here to logout</font></a></td>
		</tr>
</table>
</font>
</body>
</html>