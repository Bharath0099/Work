package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@PostMapping
	public Employee saveEmp( @RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	@PutMapping
	public Employee updateEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	@DeleteMapping
	public String deleteEmp(@RequestParam Integer empId) {
		 employeeRepository.deleteById(empId);
		return "deleted succesfully";
		 
		
	}
	
	
	@GetMapping("/fetch-all")
	public List<Employee> getAllEmps() {
		return employeeRepository.findAll();
		
	}
//	@GetMapping
//	public Employee getAllEmps(@RequestParam Integer empId) {
//		return employeeRepository.getById(empId);
//		
//	}
	@GetMapping
	//@RequestMapping(path = "/fetch-all" , method = RequestMethod.Get)
	public Employee getAllEmps(@RequestParam Integer empId) {
		return employeeRepository.findById(empId).get();
		
	}
	
	
	
}
