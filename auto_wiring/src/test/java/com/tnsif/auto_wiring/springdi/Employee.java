package com.tnsif.auto_wiring.springdi;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private boolean check;
	
	public boolean isCheck() {
		return check;
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}

	// Reference to the department the employee belongs to
    private Department department;

    // Getter for employee id
    public int getId() {
        return id;
    }

    // Setter for employee id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for employee name
    public String getName() {
        return name;
    }

    // Setter for employee name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employee salary
    public double getSalary() {
        return salary;
    }

    // Setter for employee salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for employee's department
    public Department getDepartment() {
        return department;
    }

    // Setter for employee's department
    public void setDepartment(Department department) {
        this.department = department;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", check=" + check + ", department="
				+ department + "]";
	}
}