package com.financialcontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financialcontrol.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	
	public AppUser findByLogin(String login);
	
}
