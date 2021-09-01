package com.resteasy.StudentsServices;

import java.util.List;

import javax.persistence.EntityManager;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import com.resteasy.StudentModel.Student;

@Singleton
public class StudentServiceImpl implements StudentService {

	@Inject
	Provider<EntityManager> std;

	@Transactional
	@Override
	public boolean addStudent(Student s) {
		EntityManager em = std.get();
		em.persist(s);
		return true;
	}

	@Transactional
	@Override
	public List<Student> readStudents() {
		EntityManager em = std.get();
		List<Student> studentList = em.createQuery("from Student", Student.class).getResultList();
		return studentList;
	}

	@Override
	@Transactional
	public boolean deleteStudentById(Integer id) {
		EntityManager em = std.get();
		Student std = em.find(Student.class, id);
		em.remove(std);
		return true;
	}

	@Transactional
	@Override
	public Student updateStudentById(Integer id) {
		EntityManager em = std.get();
		Student s = em.find(Student.class, id);
		return s;
	}

	@Transactional
	@Override
	public boolean updateStudent(Student s, int id) {
		EntityManager em = std.get();
		Student student = em.find(Student.class, id);
		student.setFname(s.getFname());
		student.setLname(s.getLname());
		student.setEmail(s.getEmail());
		student.setMobileNo(s.getMobileNo());
		student.setGender(s.getGender());
		student.setCourse(s.getCourse());
		return true;
	}
}
