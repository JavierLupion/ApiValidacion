package com.validacion.model;

import com.validacion.validador.ValidadorEmail;
import com.validacion.validador.ValidadorEmployeeCode;
import com.validacion.validador.ValidadorNPositivo;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data	
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@ValidadorNPositivo
	Integer id;
	
	@NotBlank(message = "Debes ingresar un nombre válido")
	private String name;

	@ValidadorEmail
	private String email;
	
	@ValidadorEmployeeCode
	private String employeeCode;

	
	public Employee(int id, @NotBlank String name, String email, String employeeCode) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.employeeCode = employeeCode;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	
	
	

}
