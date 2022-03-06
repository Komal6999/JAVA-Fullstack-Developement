<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details</title>
</head>
<body background="https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg">
<font color="white">
<% int id=(int) request.getSession().getAttribute("id1"); 
 request.getSession().setAttribute("cid",id); %>
<form action="cupdate" method="post">
<h5>(All the fields are required, Please don't leave any field empty)</h5>
	Username: <input type="text" name="uname"><br>
	Age: <input type="text" name="age"><br>
	City of Residence: <input type="text" name="cof"><br>
	<input type="submit" value="Save"/>
</font>
</form>

</body>
</html>