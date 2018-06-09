package com.financialcontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialcontrol.model.AppUser;
import com.financialcontrol.repository.AppUserRepository;

@Service
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	AppUserRepository appUserRepository;
	
	@Override
	public List<AppUser> listUsers() {
		return appUserRepository.findAll();
	}

	@Override
	public AppUser findByUsername(String name){
		return appUserRepository.findByLogin(name);
	}
	
	

	
	
}
