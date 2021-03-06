package com.financialcontrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppUser {

	@Id
	@GeneratedValue
	private Long id;
	
	private String login;

	private String secret;
	
	public AppUser() {}
	
	public AppUser(String login, String secret) {}
	
	public AppUser(AppUser auth){
		this.login = auth.getLogin();
        this.secret = auth.getSecret();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	

	
}
