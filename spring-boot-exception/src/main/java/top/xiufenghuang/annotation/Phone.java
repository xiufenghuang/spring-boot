package top.xiufenghuang.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.constraints.ConstraintComposition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =PhoneValidator.class)

public @interface Phone {
    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}