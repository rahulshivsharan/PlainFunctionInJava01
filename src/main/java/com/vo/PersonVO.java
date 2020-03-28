package com.vo;

import java.io.Serializable;

public class PersonVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1304663241423L;
	
	private String fullName;
	private Integer age;
	private Integer salary;
	
	public PersonVO(String fullName, Integer age, Integer salary) {
		this.fullName = fullName;
		this.salary = salary;
		this.age = age;
	}
	
	
	
	
	
	
	public String getFullName() {
		return fullName;
	}






	public Integer getAge() {
		return age;
	}






	public Integer getSalary() {
		return salary;
	}






	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("NAME : ").append("\"").append(this.fullName).append("\"\n")
			.append("Age : ").append("\"").append(this.age).append("\"\n")
			.append("Salary : ").append("\"").append(this.salary).append("\"\n");
		return strb.toString();
	}
}
