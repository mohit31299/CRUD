package com.cognizant.Employee.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cognizant.Employee.Entity.Employee;
import com.cognizant.Employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> retrieve() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public Employee deleteById(Long employeeId) {

		Employee tmp = employeeRepository.findById(employeeId).get();
		employeeRepository.deleteById(employeeId);

		return tmp;
	}

	@Override
	public List<Employee> fetchEmployeeByDepartment(String department) {
		return employeeRepository.findByDepartment(department);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {

		Employee tmp = employeeRepository.findById(id).get();

		if (Objects.nonNull(employee.getEmployeeName()) && !"".equals(employee.getEmployeeName())) {
			tmp.setEmployeeName(employee.getEmployeeName());
		}

		if (Objects.nonNull(employee.getEmployeeLastName()) && !"".equals(employee.getEmployeeLastName())) {
			tmp.setEmployeeLastName(employee.getEmployeeLastName());
		}

		if (Objects.nonNull(employee.getEmail()) && !"".equals(employee.getEmail())) {
			tmp.setEmail(employee.getEmail());
		}

		if (Objects.nonNull(employee.getLocation()) && !"".equals(employee.getLocation())) {
			tmp.setLocation(employee.getLocation());
		}

		if (Objects.nonNull(employee.getDepartment()) && !"".equals(employee.getDepartment())) {
			tmp.setDepartment(employee.getDepartment());
		}

		if (Objects.nonNull(employee.getSalary()) && !"".equals(employee.getSalary())) {
			tmp.setSalary(employee.getSalary());
		}

		return employeeRepository.save(tmp);
	}

}
