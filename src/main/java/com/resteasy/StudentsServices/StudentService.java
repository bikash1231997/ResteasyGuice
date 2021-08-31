package com.resteasy.StudentsServices;

import java.util.List;

import com.resteasy.StudentModel.Student;

public interface StudentService {
	  public boolean addStudent(Student s) ;
	  public List<Student> readStudents() ;

}
