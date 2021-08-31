package com.resteasy.StudentAbstractModel;

import com.google.inject.AbstractModule;
import com.resteasy.StudentsResources.StudentResource;
import com.resteasy.StudentsServices.StudentService;
import com.resteasy.StudentsServices.StudentServiceImpl;

public class StudentAbsModel extends AbstractModule {
	@Override
	protected void configure() {
		bind(StudentResource.class);
		bind(StudentService.class).to(StudentServiceImpl.class);
	}

}
