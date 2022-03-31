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
		<h2 class="display-4">Successfully Updated User</h2>
		
		<div class="jumbotron">
			<p class="lead"> User ID: ${IDedit}</p>
			<div>
				<table style="float:inherit">
				   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
				   <c:forEach items="${user}" var="userE" varStatus="count">
				    <tr id="${count.index}">
				    	<td>${userE.id}</td>
				        <td>${userE.name}</td>
				        <td>${userE.email}</td>
				        <td>${userE.password}</td>
				    </tr>
					</c:forEach>
				</table>
			</div>
			<br><br>
			<h3>Return to Homepage</h3>
			<div>
				<a href="/">Return</a>
			</div>
		</div>
	</div>
	</div>
	</div>
</body>
</html>