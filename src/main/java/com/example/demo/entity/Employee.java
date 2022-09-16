package com.example.demo.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity //for saving in the database




public class Employee {

	@Id			//for unique /do not duplicate
	@GeneratedValue(strategy = GenerationType.AUTO)//present in hibernate//for auto generation of values
	private Integer empId;
	
	
	
//	@Size(min =3, max = 15,message =  "Employee name should between 3 and 15 char")
//	@NotEmpty(message = "Employee name should not be null or empty")
	private String empName;
	
	////@NotEmpty(message = "Employee name should not be null or empty")
	//@Min(value = 10000)
	private Integer empSalary;
	
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
}
