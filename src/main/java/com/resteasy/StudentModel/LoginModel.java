package com.resteasy.StudentModel;

public class LoginModel {
	private String first_name ;
	private String last_name ;
	private String email_addr;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_addr() {
		return email_addr;
	}
	public void setEmail_addr(String email_addr) {
		this.email_addr = email_addr;
	}
	public LoginModel(String first_name, String last_name, String email_addr) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_addr = email_addr;
	}
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginModel [first_name=" + first_name + ", last_name=" + last_name + ", email_addr=" + email_addr + "]";
	}

}
