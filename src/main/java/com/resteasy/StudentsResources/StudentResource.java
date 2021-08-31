package com.resteasy.StudentsResources;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.core.Context;

import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
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
		return new View("/viewStudent.jsp");
	}

	@GET
	@Path("/update")
	public View updateStudent() {
		System.out.println("hi this is update");
		return new View("/updateStudent.jsp");
	}

	@GET
	@Path("/delete")
	public View deleteStudent() {
		System.out.println("hi this is delete");
		return new View("/deleteStudent.jsp");
	}

	@POST
	@Path("/addStd")
	// @Produces(MediaType.JSON_UTF_8)
	public void addStd(@Context HttpServletResponse response, @Context HttpServletRequest request) throws IOException {
		
		/*
		 * String first_name = request.getParameter("first_name"); String last_name =
		 * request.getParameter("last_name"); String email_addr =
		 * request.getParameter("email_addr"); System.out.println( "hi" +
		 * "first name is " + first_name + " last name is" + last_name + "email addr is"
		 * + email_addr); boolean status = user.authenticate(first_name, last_name); if
		 * (status) { response.sendRedirect(request.getContextPath() +
		 * "/student/controller"); } else {
		 * response.sendRedirect(request.getContextPath() + "/student"); }
		 */
	}

}
