package com.tnsif.auto_wiring.springdi;

import java.util.List;

public class Department {
	 private String departmentName; 
	 private List<Employee> employeeList;
	 public String getDepartmentName() {
		 return departmentName;
	 }
	 public void setDepartmentName(String departmentName) {
		 this.departmentName = departmentName;
	 }
	 public List<Employee> getEmployeeList() {
		 return employeeList;
	 }
	 public void setEmployeeList(List<Employee> employeeList) {
		 this.employeeList = employeeList;
		 for (Employee employee : employeeList) {
	            employee.setDepartment(this);
	        }
	 }
		 public Double getSecondHighestSalary() {
		        // Sort the list of employee salaries in descending order and return the second highest salary
		        return employeeList.stream()
		                .map(Employee::getSalary)
		                .sorted((a, b) -> Double.compare(b, a)) // Sort in descending order
		                .skip(1) // Skip the first (highest) salary
		                .findFirst() // Get the next (second highest) salary
		                .orElse(null); // Return null if there is no second highest salary
	 }
}
