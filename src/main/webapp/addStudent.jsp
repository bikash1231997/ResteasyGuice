<%@page import="com.resteasy.StudentModel.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Regisdivation Form Using HTML</title>
<style>
h2 {
	font-family: Sans-serif;
	font-size: 24px;
	font-style: normal;
	font-weight: bold;
	color: blue;
	text-align: center;
	text-decoration: underline
}

#sdiv_add {
	font-family: verdana;
	color: white;
	font-size: 16px;
	font-style: normal;
	font-weight: bold;
	background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
	border-collapse: collapse;
	border: 4px solid #000000;
	border-style: dashed;
	width: 40%;
	margin-top: 10%;
	margin-left: 30%
}

form {
	border: 10px
}

input[type=text], input[type=email], input[type=number] {
	width: 50%;
	padding: 6px 12px;
	margin: 5px 0;
	box-sizing: border-box;
}

input[type=submit], input[type=reset] {
	width: 15%;
	padding: 8px 12px;
	margin: 5px 0;
	box-sizing: border-box;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#Cancle").click(function() {
			alert();
			window.location.href = '/resteasy/student';
		});
	});
</script>
</head>
<body>
	<h2>Student Regisdivation Form Using HTML</h2>
	<div id="sdiv_add" align="center">
		<%-- <form action="addStd" ACTION="<%=request.getContextPath()%>/contact/addStd" METHOD="POST"> --%>
		<FORM ACTION="<%=request.getContextPath()%>/student/addStd" METHOD="POST">
			<div>
				<div>First Name</div>
				<div>
					<input type="text" name="FirstName" maxlength="50"
						placeholder="Enter Firstname" /> (Max 50 Characters Allowed)
				</div>
			</div>
			<div>
				<div>Last Name</div>
				<div>
					<input type="text" name="LastName" maxlength="50"
						placeholder="Enter LastName" /> (Max 50 Characters Allowed)
				</div>
			</div>
			<div>
				<div>Email ID</div>
				<div>
					<input type="email" name="EmailID" maxlength="100"
						placeholder="example@gmail.com" />
				</div>
			</div>
			<div>
				<div>Mobile Number</div>
				<div>
					<input type="text" name="MobileNumber" size="10" maxlength="10"
						placeholder="93487950xx" /> (10 Digits Allowed)
				</div>
			</div>
			<div>
				<div>Gender</div>
				<div>
					<input type="radio" name="Gender" value="Male" /> Male <input
						type="radio" name="Gender" value="Female" /> Female
				</div>
			</div>
			<div>
				<div>
					Courses<br />Applied For
				</div>
				<div>
					<input type="radio" name="Course" value="BCA"> BCA<br>
					<input type="radio" name="Course" value="B.Com"> B.Com<br>
					<input type="radio" name="Course" value="B.Sc"> B.Sc<br>
					<input type="radio" name="Course" value="BCA"> MCA<br>
				</div>
			</div>
			<div>
				<div colspan="2" align="center">
					<input type="submit" value="Add Student"> <input
						type="button" id="Cancle" value="Cancle">
				</div>
			</div>
		</form>
	</div>
</body>
</html>