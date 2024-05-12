package com.emp.service;

import java.util.List;
import java.util.Optional;

import com.emp.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployeeById(Long id);
	public Employee updateEmployee(Long id,Employee updateEmployee);
	public void deleteEmployee(Long id);
}
