package com.jigyasa.model;

public class Employee {

	private String id;
	private String name;
	private String dept;
	private double salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
	
	
	public void displayInfo(){
		System.out.println("Id is "+ this.id +"Student is : " + this.name + " Deptartment is" + this.dept +"Salary is " + this.salary );
	}
		
}
