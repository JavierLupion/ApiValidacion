package com.validacion.validador;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidadorNPositivoImpl implements ConstraintValidator<ValidadorNPositivo, Integer>{

	@Override
	public boolean isValid(Integer i, ConstraintValidatorContext context) {
		return i>0 && i!=null;
	}
	
}
	
