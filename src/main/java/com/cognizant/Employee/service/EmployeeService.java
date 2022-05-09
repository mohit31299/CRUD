package com.cognizant.Employee.service;

import java.util.List;

import com.cognizant.Employee.Entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> retrieve();

	public Employee fetchEmployeeById(Long employeeId);

	public Employee deleteById(Long employeeId);

	public List<Employee> fetchEmployeeByDepartment(String department);

	public Employee updateEmployee(Long id, Employee employee);

}
