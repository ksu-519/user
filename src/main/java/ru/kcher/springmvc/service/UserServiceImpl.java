package ru.kcher.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kcher.springmvc.model.User;
import ru.kcher.springmvc.repository.UserRepository;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		return userRepository.findOne(id);
	}
	
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUserById(Long id) {
		userRepository.delete(id);
	}
	
	public void deleteAllUsers(){
		userRepository.deleteAll();
	}
}
