<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<style type="text/css">
form {
	font-family: verdana;
	color: white;
	font-size: 16px;
	font-style: normal;
	font-weight: bold;
	background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
	border-collapse: collapse;
	border: 4px solid #000000;
	border-style: dashed;
	width: 10%;
	margin-top: 10%;
	/* margin-left: 40%; */
}
</style>
</head>
<body>
	<center>
		<form action="student/ActionForm" method="POST">
			First Name: <input type="text" name="first_name"> <br />
			Last Name: <input type="text" name="last_name" /> <br /> <input
				type="submit" value="Login" />
		</form>
	</center>
</body>
</html>