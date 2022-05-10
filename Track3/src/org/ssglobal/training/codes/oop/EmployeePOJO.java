package org.ssglobal.training.codes.oop;

//POJO --> table schema
public class EmployeePOJO {
	
	/*
	 * * Table: employee
	 * 			| id | fname | lname | age | salary |
	 */

	private String id;
	private String fname;
	private String lname;
	private Integer age;
	private Double salary;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
