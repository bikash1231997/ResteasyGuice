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
	Provider<EntityManager> emp;

	@Transactional
	@Override
	public boolean addStudent(Student s) {
		EntityManager em = emp.get();
		em.persist(s);
		return true;
	}
	
	  @Transactional
	  @Override
	  public List<Student> readStudents() {
	    EntityManager em = emp.get();
	    List<Student> studentList = em.createQuery("from Student", Student.class).getResultList();
	    return studentList;
	  }

}
