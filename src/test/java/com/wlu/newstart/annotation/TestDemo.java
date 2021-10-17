package com.wlu.newstart.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 注解读取类
 *
 * @author: 王璐
 * @created: 2021/10/17 16:40
 */
public class TestDemo {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class<Demo> clazz = Demo.class;
        MyAnnotation annotationOnClass = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnClass.getValue());

        Field name = clazz.getField("name");
        MyAnnotation annotationOnField = name.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnClass.getValue());

        Method hello = clazz.getMethod("hello");
        MyAnnotation annotationOnMethod = hello.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnMethod.getValue());

        Method defaultMethod = clazz.getMethod("defaultMethod");
        MyAnnotation annotationOnDefaultMethod = defaultMethod.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnDefaultMethod.getValue());
    }

}
