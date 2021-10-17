package com.wlu.newstart.annotation;

/**
 * 使用注解类
 *
 * @author: 王璐
 * @created: 2021/10/17 16:25
 */
@MyAnnotation(getValue = "annotation on class")
public class Demo {

    @MyAnnotation(getValue = "annotation on field")
    public String name;
    @MyAnnotation(getValue = "annotation on method")
    public void hello(){}
    @MyAnnotation()
    public void defaultMethod(){}
}
