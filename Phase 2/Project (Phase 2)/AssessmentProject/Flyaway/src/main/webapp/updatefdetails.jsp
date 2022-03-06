<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateFlightDetails</title>
</head>
<body>
<% String id=request.getParameter("id"); 
 request.getSession().setAttribute("fid",id); %>
<form action="update" method="post">
<h5>(All the fields are required, Please don't leave any field empty)</h5>
	Airline Name: <input type="text" name="aname"><br>
	Operating Date: <input type="text" name="date"><br>
	Source: <input type="text" name="src"><br>
	Destination: <input type="text" name="dest"><br>
	Ticket Price: <input type="text" name="price"><br>
	<input type="submit" value="Save"/>
</form>

</body>
</html>