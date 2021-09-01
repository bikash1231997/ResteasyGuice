<%@page import="com.resteasy.StudentModel.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
		<h3>Edit Form</h3>
		<%
		  Student std = (Student) request.getAttribute("studentobj");
		%>

		<FORM ACTION="<%=request.getContextPath()%>/student/update" METHOD="POST" name="student">
			Student Id :<% out.print(" " + std.getId());%><br> <br>
			<INPUT TYPE="hidden" NAME="id" VALUE="<%=std.getId()%>"> 
			First Name:<INPUT TYPE="TEXT" NAME="FirstName" VALUE="<%=std.getFname()%>"> <br>
			Last Name:<INPUT TYPE="TEXT" NAME="LastName" VALUE="<%=std.getLname()%>"> <br>
			Email:<INPUT TYPE="email" NAME="EmailID" VALUE="<%=std.getEmail()%>"> <br>
			Mobile No:<INPUT TYPE="TEXT" NAME="MobileNumber" VALUE="<%=std.getMobileNo()%>"> <br>
			Gender:<INPUT TYPE="TEXT" NAME="Gender" VALUE="<%=std.getGender()%>"> <br>
			course:<INPUT TYPE="TEXT" NAME="Course" VALUE="<%=std.getCourse()%>"> <br>
				
			<br>
			<INPUT TYPE="SUBMIT" VALUE="SUBMIT" />


		</FORM>
	</center>

</body>
</html>