package com.cognizant.Employee.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
@Table(name="Employee")
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	Long employeeId;
	
	@Column(name="first_name")
	String employeeName;
	
	@Column(name="last_name")
	String employeeLastName;
	
	@Column(name="email_id")
	String email;
	
	@Column(name="location")
	String location;
	
	@Column(name="department")
	String department;
	
	@Column(name="salary")
	int salary;

	public Employee() {
		super();
	}

	public Employee(Long employeeId, String employeeName, String employeeLastName, String email, String location,
			String department, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeLastName = employeeLastName;
		this.email = email;
		this.location = location;
		this.department = department;   
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeLastName="
				+ employeeLastName + ", email=" + email + ", location=" + location + ", department=" + department
				+ ", salary=" + salary + "]";
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
