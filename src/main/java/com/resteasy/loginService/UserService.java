package com.resteasy.loginService;

import com.google.inject.ImplementedBy;

@ImplementedBy(UserServiceImpl.class)
public interface UserService {
	boolean authenticate(String firstname, String lastname);
}
