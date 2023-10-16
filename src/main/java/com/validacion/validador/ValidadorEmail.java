package com.validacion.validador;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ValidadorEmailImpl.class)
public @interface ValidadorEmail {

	String message() default "Debe ingresar un mail válido";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};


}
