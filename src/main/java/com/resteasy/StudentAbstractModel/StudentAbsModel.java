package com.resteasy.StudentAbstractModel;

import com.google.inject.AbstractModule;
import com.resteasy.StudentsResources.StudentResource;
import com.resteasy.StudentsServices.StudentService;
import com.resteasy.StudentsServices.StudentServiceImpl;
import com.resteasy.loginService.UserService;
import com.resteasy.loginService.UserServiceImpl;

public class StudentAbsModel extends AbstractModule {
	@Override
	protected void configure() {
		bind(StudentResource.class);
		bind(StudentService.class).to(StudentServiceImpl.class);
		bind(UserService.class).to(UserServiceImpl.class);
	}

}
