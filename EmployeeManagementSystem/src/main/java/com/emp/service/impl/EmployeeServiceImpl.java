package com.emp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
import com.emp.repository.EmployeeRepository;
import com.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		
		return employeeRepository.findById(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee updateEmployee) {
		if(employeeRepository.existsById(id)) {
			updateEmployee.setId(id);
			return employeeRepository.save(updateEmployee);
		}
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

}
