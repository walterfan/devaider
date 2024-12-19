package com.github.walterfan.devaider.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
  int id() default -1;
  
  String name();
  
  String description() default "";
  
  String preCondition() default "";
  
  String standardFlow() default "";
  
  String alternateFlow() default "";
  
  String postCondition() default "";
}
