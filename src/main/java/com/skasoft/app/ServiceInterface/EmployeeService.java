package com.skasoft.app.ServiceInterface;

import com.skasoft.app.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public Iterable<Employee> showAllEmployee();

	public Employee updateEmployee(int id, Employee employee);

	public void deleteEmployee(int id);
	

}
