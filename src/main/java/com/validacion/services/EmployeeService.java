package com.validacion.services;

import java.util.ArrayList;

import com.validacion.model.Employee;

public interface EmployeeService {
	
	public ArrayList<Employee> getAllEmployees();
	public Employee getEmployee(int id);
	public Employee saveEmployee(Employee e);
	public Employee updateEmployee(Employee p);
	public Employee deleteEmployee(int id);

}