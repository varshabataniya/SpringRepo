package com.flamingo.dao;

import java.util.List;

import com.flamingo.modal.UserDetails;

public interface UsersDetail {

	
	void insert(UserDetails userDetails); 
	void update(UserDetails userDetails);
	void delete(UserDetails userDetails);
	
	
	UserDetails findUserDetailsById(int userId);
	List<UserDetails> findUserByName(UserDetails userDetails);
	
	
	
	
}
