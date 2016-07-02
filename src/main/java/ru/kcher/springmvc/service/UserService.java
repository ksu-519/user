package ru.kcher.springmvc.service;

import java.util.List;

import ru.kcher.springmvc.model.User;


public interface UserService {
	
	User findById(Long id);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(Long id);

	List<User> findAllUsers();
	
	void deleteAllUsers();
}
