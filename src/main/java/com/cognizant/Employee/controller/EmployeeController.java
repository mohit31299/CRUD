package com.cognizant.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Employee.Entity.Employee;
import com.cognizant.Employee.service.EmployeeService;

@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);

	}

	@GetMapping("/show")
	public List<Employee> retrieve() {
		return employeeService.retrieve();
	}

	@GetMapping("/show/{id}")
	public Employee fetchEmployeeById(@PathVariable("id") Long employeeId) {
		return employeeService.fetchEmployeeById(employeeId);
	}

	@GetMapping("/show/department/{department}")
	public List<Employee> fetchEmployeeByDepartment(@PathVariable("department") String department) {
		return employeeService.fetchEmployeeByDepartment(department);
	}

	@DeleteMapping("/delete/{id}")
	public Employee deleteById(@PathVariable("id") Long employeeId) {
		return employeeService.deleteById(employeeId);

	}

	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);
	}

}
