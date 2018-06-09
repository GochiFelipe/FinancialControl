package com.financialcontrol.service;

import java.util.List;

import com.financialcontrol.model.AppUser;

public interface AppUserService {
	
	public List<AppUser> listUsers();
	public AppUser findByUsername(String name);
	
}
