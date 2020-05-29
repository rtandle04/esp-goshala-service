package com.goshala.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goshala.dto.User;
import com.goshala.entity.UserRepository;

@Service
public class GoshalaServiceImpl {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean SaveEntity(User user) {
		User save = userRepository.save(user);
		System.out.println(save);
		return true;
	}
	
	public List<User> findAllEntity() {
		List<User> entityList = (List<User>) userRepository.findAll();
		return entityList;
	}
	
	public String deleteEntity(Long userId) {
		userRepository.deleteById(userId);
		return "Deleted Successful";
	}
}