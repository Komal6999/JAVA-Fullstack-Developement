<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
table, th, td {
  border: 1px solid black;
  	  margin: auto;
  
}
		.center {
	  		text-align: center;
	  	}
</style>
</head>
<body style="background-color:lightblue;">
	<div class="d-flex justify-content-center">
		<div class="w-75 p-3">
		 <div class="center">
		
		<div class="jumbotron">
			<h2 class="display-4">Users</h2>
			
			<table style="float:inherit">
			   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
			   <c:forEach items="${users}" var="user" varStatus="count">
			    <tr id="${count.index}">
			    	<td>${user.id}</td>
			        <td>${user.name}</td>
			        <td>${user.email}</td>
			        <td>${user.password}</td>
			    </tr>
			  </c:forEach>
			</table>
		</div>
	  </div>
	 </div>
	</div>
</body>
</html>

