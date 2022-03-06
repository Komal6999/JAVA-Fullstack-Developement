<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Flights</title>
</head>
<body background="https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg">
<font color="white">
<form action="save" method="post">
<h5>(All the fields are required, Please don't leave any field empty)</h5>
	Airline Name: <input type="text" name="aname"><br>
	Operating Date: <input type="text" name="date"><br>
	Source: <input type="text" name="src"><br>
	Destination: <input type="text" name="dest"><br>
	Ticket Price: <input type="text" name="price"><br>
	<input type="submit" value="Save"/>
</font>
</form>
</body>
</html>