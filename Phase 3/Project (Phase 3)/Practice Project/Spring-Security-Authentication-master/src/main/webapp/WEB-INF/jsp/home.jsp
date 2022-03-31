<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<style>
		.center {
	  		text-align: center;
	  	}
	  	
	</style>
</head>
<body style="background-color:lightblue;">
	<div class="d-flex justify-content-center">
		<div class="w-75 p-3">
		 <div class="center">
			<h1 class="display-4">Spring Security</h1>
				<div class="jumbotron">
					<p class="lead">Login below to access the user's table</p>
					
					<form method="post" action="index">
						<input type="text" id="namelogin" name="namelogin" placeholder="Name" required>
						<input type="text" id="passwordlogin" name="passwordlogin" placeholder="Password" required>	
						<input type="submit" value="Enter" class="btn btn-primary mb-2" />
					</form>
				</div>
		 </div>
		</div>
	</div>
</body>
</html>

