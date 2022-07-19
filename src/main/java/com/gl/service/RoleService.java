package com.gl.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gl.model.Role;
import com.gl.repository.RoleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleService {

	private final RoleRepository roleRepository;
	
	@Transactional
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}
	
}
