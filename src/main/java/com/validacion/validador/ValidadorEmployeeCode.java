package com.validacion.validador;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ValidadorEmployeeCodeImpl.class)
public @interface ValidadorEmployeeCode {

	String message() default "Debe ingresar un código válido ej: 'EMP-dep-123";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}