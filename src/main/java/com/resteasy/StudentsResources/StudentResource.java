package com.resteasy.StudentsResources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.resteasy.StudentModel.Student;
import com.resteasy.StudentsServices.StudentService;

/*import org.jboss.resteasy.plugins.providers.html.View;

import com.google.inject.Inject;
import com.resteasy.StudentsServices.StudentService;
*/
@Path("student")
public class StudentResource {
	@Inject StudentService ss;
	/*
	 * 
	 * @GET
	 * 
	 * @Path("studentview") public View readStudents() { return new
	 * View("/Student.jsp"); }
	 */
	@GET
	public String getmessage()
	{
		System.out.println("hi this is call");
		return "hello this is return";	
	}
	
	 @GET
	  @Path("viewstd")
	  public View readStudents() {
	    List<Student> list = ss.readStudents();
	    return new View("/student.jsp",  list,"studentList");
	  }

}
