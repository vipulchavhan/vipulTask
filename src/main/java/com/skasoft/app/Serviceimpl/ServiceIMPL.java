package com.skasoft.app.Serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skasoft.app.ServiceInterface.EmployeeService;
import com.skasoft.app.model.Employee;
import com.skasoft.app.repository.EmployeeRepo;
@Service
public class ServiceIMPL implements EmployeeService{
	@Autowired 
	EmployeeRepo er;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return er.save(employee);
	}

	@Override
	public Iterable<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		
		Optional<Employee> oe = er.findById(id);
		if (oe.isPresent()) {
			Employee employee2 = oe.get();
			employee.setId(employee2.getId());
			return er.save(employee);
			
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public void deleteEmployee(int id) {
		er.deleteById(id);
	}

}
