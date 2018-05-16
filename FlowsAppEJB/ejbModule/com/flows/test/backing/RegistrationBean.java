package com.flows.test.backing;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("registration") // Sesuai dengan IDnya definition
public class RegistrationBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String firstname, lastname, post_code, city;
	
	@PostConstruct
	private void init() {
		System.out.println("Flow entered.");
	}
	
	@PreDestroy
	private void deinit() {
		System.out.println("Flow exitted.");
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
