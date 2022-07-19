package com.gl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gl.model.Employee;
import com.gl.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	
	@Transactional
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Transactional
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Transactional
	public Employee findById(long id) {
		return employeeRepository.findById(id).orElseThrow(()->new IllegalArgumentException("No student found."));
	}

	@Transactional
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
	}
	
	@Transactional
	public Employee updateEmployee(Employee employee, long employeeId) {
		return employeeRepository.save(employee);
	}
}
