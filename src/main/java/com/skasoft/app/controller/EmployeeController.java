package com.skasoft.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skasoft.app.ServiceInterface.EmployeeService;
import com.skasoft.app.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		Employee saveEmployee = es.saveEmployee(employee);
		return saveEmployee;
	}
	
	@GetMapping("/showEmployee")
	public Iterable<Employee> showAllEmployee(){
		Iterable<Employee> employee = es.showAllEmployee();
		return employee;
	}
	
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		 
		 Employee updateEmployee = es.updateEmployee(id,employee);
		 return updateEmployee;
		
	}
 
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		es.deleteEmployee(id);
	}
}
