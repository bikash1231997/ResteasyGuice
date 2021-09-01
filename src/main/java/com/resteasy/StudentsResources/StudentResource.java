package com.resteasy.StudentsResources;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.core.Context;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.resteasy.StudentModel.Student;
import com.resteasy.StudentsServices.StudentService;
import com.resteasy.loginService.UserService;

/*import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.resteasy.StudentsServices.StudentService;
*/
@Path("student")
public class StudentResource {
	@Inject
	StudentService ss;

	@Inject
	UserService user;

	/*
	 * 
	 * @GET
	 * 
	 * @Path("studentview") public View readStudents() { return new
	 * View("/Student.jsp"); }
	 */
	@GET
	public View getmessage() {
		System.out.println("hi this is call");
		return new View("/login.jsp");
	}
	/*
	 * @GET
	 * 
	 * @Path("viewstd") public View readStudents() { List<Student> list =
	 * ss.readStudents(); return new View("/student.jsp", list, "studentList"); }
	 */

	/*
	 * @POST
	 * 
	 * @Path("ActionForm") // @Produces(MediaType) public void test(@Context
	 * HttpServletRequest req, @Context HttpServletResponse resp,
	 * 
	 * @PathParam("first_name") String first_name, @PathParam("last_name") String
	 * last_name,
	 * 
	 * @PathParam("email_addr") String email) throws IOException {
	 * System.out.println("hi"+"first name is " + first_name + " last name is" +
	 * last_name + "email addr is" + email);
	 * resp.getWriter().println("first name is " + first_name + " last name is" +
	 * last_name + "email addr is" + email); }
	 */
	@POST
	@Path("/ActionForm")
	// @Produces(MediaType.JSON_UTF_8)
	public void postlogin(@Context HttpServletResponse response, @Context HttpServletRequest request)
			throws IOException {

		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email_addr = request.getParameter("email_addr");
		System.out.println(
				"hi" + "first name is " + first_name + " last name is" + last_name + "email addr is" + email_addr);
		boolean status = user.authenticate(first_name, last_name);
		if (status) {
			response.sendRedirect(request.getContextPath() + "/student/controller");
		} else {
			response.sendRedirect(request.getContextPath() + "/student");
		}
	}

	@GET
	@Path("/controller")
	public View controlStudent() {
		System.out.println("hi this is controller");
		return new View("/Controller.jsp");
	}

	@GET
	@Path("/create")
	public View createStudent() {
		System.out.println("hi this is create");
		return new View("/addStudent.jsp");
	}

	@GET
	@Path("/read")
	public View viewStudent() {
		System.out.println("hi this is view");
		List<Student> std = ss.readStudents();

		for (Student s : std) {
			System.out.println(
					s.getFname() + " " + s.getLname() + " " + s.getCourse() + " " + s.getEmail() + " " + s.getGender());

		}
		return new View("/viewStudent.jsp", std, "student");
	}

	@POST
	@Path("/update")
	public void updateStudent(@Context HttpServletResponse response, @Context HttpServletRequest request)
			throws IOException {
		
		System.out.println("hi this is update complete ");
		
		Student std = new Student();

		std.setFname(request.getParameter("FirstName"));
		std.setLname(request.getParameter("LastName"));
		std.setEmail(request.getParameter("EmailID"));
		std.setMobileNo(request.getParameter("MobileNumber"));
		std.setGender(request.getParameter("Gender"));
		std.setCourse(request.getParameter("Course"));
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		ss.updateStudent(std, id);
		
		response.sendRedirect(request.getContextPath() + "/student/read");
	}

	@GET
	@Path("/read/{id}")
	public View viewStudentById(@Context HttpServletResponse response, @Context HttpServletRequest request,
			@PathParam("id") Integer id) {
		System.out.println("hi this is update std" + id);
		Student s = ss.updateStudentById(id);
		System.out.println(
				s.getFname() + " " + s.getLname() + " " + s.getCourse() + " " + s.getEmail() + " " + s.getGender());
		return new View("/viewbyid.jsp", s, "studentobj");
	}

	@GET
	@Path("/delete/{id}")
	public void deleteStudent(@PathParam("id") Integer id, @Context HttpServletResponse response,
			@Context HttpServletRequest request) throws IOException {
		System.out.println("hi this is delete");
		ss.deleteStudentById(id);
		response.sendRedirect(request.getContextPath() + "/student/read");
	}

	@POST
	@Path("/addStd")
	public void addStd(@Context HttpServletResponse response, @Context HttpServletRequest request) throws IOException {
		System.out.println("hi this is add student");
		Student std = new Student();
		String fname = request.getParameter("FirstName");
		String lname = request.getParameter("LastName");
		String mobile = request.getParameter("MobileNumber");
		String email = request.getParameter("EmailID");
		String gender = request.getParameter("Gender");
		String course = request.getParameter("Course");

		std.setFname(fname);
		std.setLname(lname);
		std.setEmail(email);
		std.setMobileNo(mobile);
		std.setGender(gender);
		std.setCourse(course);

		ss.addStudent(std);
		response.sendRedirect(request.getContextPath() + "/student/read");
	}

}
