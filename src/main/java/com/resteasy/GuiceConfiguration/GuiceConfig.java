package com.resteasy.GuiceConfiguration;

import java.util.*;
import javax.servlet.ServletContext;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import com.google.inject.*;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.resteasy.StudentAbstractModel.StudentAbsModel;

public class GuiceConfig extends GuiceResteasyBootstrapServletContextListener {

	@Override
	protected List<? extends Module> getModules(ServletContext context) {
		return Arrays.asList(new JpaPersistModule("MY_JPA"), new StudentAbsModel());
	}

	@Override
	public void withInjector(Injector injector) {
		injector.getInstance(PersistService.class).start();
	}

}
