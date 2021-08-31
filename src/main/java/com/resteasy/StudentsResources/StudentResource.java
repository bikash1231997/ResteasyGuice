package com.resteasy.StudentsResources;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.jboss.resteasy.plugins.providers.html.View;

import com.google.common.net.MediaType;
import com.google.inject.Inject;
import com.resteasy.StudentModel.LoginModel;
import com.resteasy.StudentModel.Student;
import com.resteasy.StudentsServices.StudentService;

/*import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.resteasy.StudentsServices.StudentService;
*/
@Path("student")
public class StudentResource {
	@Inject
	StudentService ss;

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
	//@Produces(MediaType.JSON_UTF_8)
	public void PostMethod(@Form LoginModel login) {
		System.out.println("hi this is post");
		String output = login.toString();
		System.out.println("login name is "+login.getFirst_name());
		//return ;
	}
}
