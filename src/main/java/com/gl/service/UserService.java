package com.gl.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gl.model.User;
import com.gl.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	
	@Transactional
	public User addUser(User user) {
		
		return userRepository.save(user);
	}
	
}
