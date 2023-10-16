package com.validacion.controllers;

import java.net.URI;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.validacion.model.Employee;
import com.validacion.services.*;

@RestController
@RequestMapping("/employees")
public class EmployeeRestControllers {
	
	EmployeeServiceImpl service = new EmployeeServiceImpl();

	@GetMapping
	public ResponseEntity<?> getEmployees() {
		ArrayList<Employee> employeesList = service.getAllEmployees();
		return ResponseEntity.ok(employeesList);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployee(@PathVariable @Validated int id) {
		Employee em = service.getEmployee(id);
			if (em == null ) {
				return ResponseEntity.notFound().build();
			} else {
				return ResponseEntity.ok(em);
			}
	}

	@PostMapping
	public ResponseEntity<?> createEmployee(@RequestBody @Validated  Employee e) {
		Employee em = service.saveEmployee(e);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(em.getId())
				.toUri();
		return ResponseEntity.created(location).body(em);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteEmployee(@PathVariable @Validated  int id) {
		Employee em = service.deleteEmployee(id);
		if (em == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(em);
		}

	}

	@PutMapping
	public ResponseEntity<?> updateEmployee(@RequestBody @Validated Employee e) {
		Employee em = service.updateEmployee(e);
		if (em == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(e);
		}
	}

}