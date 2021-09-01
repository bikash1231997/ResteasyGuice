package com.resteasy.StudentsServices;

import java.util.List;

import com.resteasy.StudentModel.Student;

public interface StudentService {
	public boolean addStudent(Student s);

	public List<Student> readStudents();

	boolean deleteStudentById(Integer id);

	public Student updateStudentById(Integer id);

	public boolean updateStudent(Student std, int id);

}
