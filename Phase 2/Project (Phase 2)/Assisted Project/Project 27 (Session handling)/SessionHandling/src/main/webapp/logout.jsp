<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   session.removeAttribute("name");
   session.invalidate();
%>
<h2>Session Terminated</h2>

<jsp:include page="index.jsp">></jsp:include>
</body>
</html>