package com.validacion.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.validacion.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Primary
public class EmployeeServiceImpl implements EmployeeService {
	
	ArrayList<Employee> employeesList = new ArrayList<>();

	public ArrayList<Employee> getAllEmployees(){
		return employeesList;
	}
	
	public Employee getEmployee(int id) {
		for (Employee em: employeesList) {
			if (em.getId() == id) {
				return em;
			}
		}
		return null;
		
	}

	public Employee saveEmployee(Employee e) {
		employeesList.add(e);
		return e;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		for (Employee em : employeesList) {
			if (em.getId() == e.getId()) {
				em.setName(e.getName());
				em.setEmail(e.getEmail());
				em.setEmployeeCode(e.getEmployeeCode());
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee deleteEmployee(int id) {
		for (Employee e : new ArrayList<>(employeesList)) {
			if (e.getId() == id) {
				employeesList.remove(e);
				return e;
			}
		}
		return null;
		
	}


}