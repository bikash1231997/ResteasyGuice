package com.resteasy.loginService;

public class UserServiceImpl implements UserService {
	public boolean authenticate(String firstname, String lastname) {
		if(firstname.equals("admin")&& lastname.equals("admin")) {
			return true;
		}else if (firstname.equals("Bikash")&& lastname.equals("Mahapatra")){
			return true;
		}else if (firstname.equals("axelor")&& lastname.equals("axelor")){
			return true;
		}
		else {
			return false;
		}
	}

}
