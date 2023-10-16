package com.validacion.validador;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ValidadorNPositivoImpl.class)
public @interface ValidadorNPositivo {

	String message() default "Debe ingresar un número positivo";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};


}