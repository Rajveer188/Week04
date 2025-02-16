package com.tit.week04.day06.annotations.begineer_level.annotation_todo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//custom annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
