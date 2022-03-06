<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Flight</title>
</head>
<body background="https://www.india.com/wp-content/uploads/2020/09/Domestic-Flights.jpg">
<font color="white">
<form action="book" method="post">
	<label for="src">Enter Source:</label>
	<select id="src" name="src">
  		<option>Mumbai</option>
  		<option>Delhi</option>
  		<option>Kolkata</option>
  		<option>Bangalore</option>
  		<option>Chennai</option>
	</select>
	<br>
	<label for="dest">Enter Destination:</label>
	<select id="dest" name="dest">
  		<option>Mumbai</option>
  		<option>Delhi</option>
  		<option>Kolkata</option>
  		<option>Bangalore</option>
  		<option>Chennai</option>
	</select>
	<br>
	<label for="date">Enter Date:</label>
	<select id="date" name="date">
  		<option>2022-02-10</option>
  		<option>2022-02-11</option>
  		<option>2022-02-12</option>
  		<option>2022-02-13</option>
  		<option>2022-02-14</option>
  		<option>2022-02-15</option>
  		<option>2022-02-16</option>
  		<option>2022-02-17</option>
  		<option>2022-02-18</option>
	</select>
	<br>
	<input type="submit" value="Search"/>
</font>
</form>

</body>
</html>