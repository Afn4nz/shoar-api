package com.example.shoarapi.category.validator;

import com.example.shoarapi.category.reposotries.CategoryRepository;
import lombok.RequiredArgsConstructor;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CategoryExists.CategoryTypeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CategoryExists {
    String message() default "Invalid Category!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @RequiredArgsConstructor
    class CategoryTypeValidator implements ConstraintValidator<CategoryExists, String> {
        private final CategoryRepository categoryRepository;

        @Override
        public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
            return value != null && categoryRepository.existsByNameEn(value.toUpperCase());
        }
    }
}