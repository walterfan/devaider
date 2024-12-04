package com.github.walterfan.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Bug {
  String id() default "";
  
  String description() default "";
  
  String openDate() default "";
  
  String closeDate() default "";
  
  String reporter() default "";
  
  String solver() default "";
  
  Severity severity() default Severity.Moderate;
}
