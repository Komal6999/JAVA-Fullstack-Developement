<%@page import="com.org.controller.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr><th>Id</th><th>Name</th><th>Price</th><th>Date</th><tr>
	<c:forEach var="record" items="${sessionScope.result}">
		<tr>
		<td><c:out value="${record.id }"></c:out></td>
		<td><c:out value="${record.name }"></c:out></td>
		<td><c:out value="${record.price }"></c:out></td>
		<td><c:out value="${record.dateAdded }"></c:out></td>
		</tr>
	</c:forEach>
	</table>

</body>
</html>