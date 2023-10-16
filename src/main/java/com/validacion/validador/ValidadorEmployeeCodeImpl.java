package com.validacion.validador;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public abstract class ValidadorEmployeeCodeImpl implements ConstraintValidator<ValidadorEmployeeCode, String> {

	private static final Pattern CODE_PATTERN = Pattern.compile("^EMP-[a-zA-Z]{3}-\\\\d{4}$");
	@Override
	public boolean isValid(String employeeCode, ConstraintValidatorContext context) {
		if (employeeCode == null) {
			return false;
		}
		return CODE_PATTERN.matcher(employeeCode).matches();
	}

}