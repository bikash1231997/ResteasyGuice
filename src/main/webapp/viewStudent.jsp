<%@page import="com.resteasy.StudentModel.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Student Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile Number</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Course</th>
			<th>Update Student</th>
			<th>Delete Student</th>
		</tr>
		<c:forEach items="${student}" var="std">
			<tr>
				<td>${std.id}</td>
				<td>${std.fname}</td>
				<td>${std.lname}</td>
				<td>${std.mobileNo}</td>
				<td>${std.email}</td>
				<td>${std.gender}</td>
				<td>${std.course}</td>
				<td><a
					href="<%=request.getContextPath()%>/student/read/${std.id}">Update</a></td>
				<td><a
					href="<%=request.getContextPath()%>/student/delete/${std.id}"
					onclick="return window.confirm('Are you sure ?')">Delete</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>