package com.map.uderdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.uderdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
