<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Session</title>
</head>
<body>
<%
     if (request.getParameter("error")!=null)
     {
    	 out.print("Your session expired");
     }
%>
<form action="login.jsp" method="post">
Name: <input type= "text" name="name" maxlength="40">
Password: <input type= "password" name="pass" maxlength="15">
<input type="submit" value="Login">
</form>
</body>
</html>