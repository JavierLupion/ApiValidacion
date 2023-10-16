package com.validacion.validador;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidadorEmailImpl implements ConstraintValidator<ValidadorEmail, String> {

	private static final Pattern CODE_PATTERN = Pattern.compile("^[A-Za-z0-9_.-]{2,}@([A-Za-z0-9-]{2,}\\\\.){1,}[A-Za-z]{1,}$");
	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (email == null) {
			return false;
		}
		return CODE_PATTERN.matcher(email).matches();
	}

}