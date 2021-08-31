<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Choose Your Preference</title>
<style type="text/css">
div {
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
	margin-left: 30%;
	margin-right: 30%
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#bton_create").click(function() {
			//alert("bton_create called.");
			window.location.href='create';
		});
		$("#bton_update").click(function() {
			//alert("bton_update called.");
			window.location.href='update';
		});
		$("#bton_read").click(function() {
			//alert("bton_read called.");
			window.location.href='read';
		});
		$("#bton_delete").click(function() {
			//alert("bton_delete called.");
			window.location.href='delete';
		});
	});
</script>
</head>
<body>
	<div style="text-align: center;">
		Create a Student
		<button type="button" id="bton_create">Create</button>
		<hr />
		Update a Student
		<button type="button" id="bton_update" style="font: bold 14px Arial;">Update</button>
		<br />
		<hr />
		Read Students
		<button type="button" id="bton_read" style="font: bold 14px Arial;">Read</button>
		<br />
		<hr />
		Delete a Student
		<button type="button" id="bton_delete" style="color: red;">
			<b>Delete </b>
		</button>
		<hr />
	</div>
</body>
</html>