package com.gl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gl.model.Role;
import com.gl.service.RoleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

	private final RoleService roletService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Role addRole(@RequestBody Role role) {
		return roletService.saveRole(role);
	}
}
