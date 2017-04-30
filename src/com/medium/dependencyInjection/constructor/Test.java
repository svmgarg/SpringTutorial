package com.medium.dependencyInjection.constructor;

/**
 * Created by svmga on 01-Apr-17.
 */


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class Test {
    public static void main(String[] args) {


        Resource resource = new FileSystemResource("src/com/medium/dependencyInjection/constructor/dependencyInjectionConstructor.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        Student student= (Student) factory.getBean("student");
        System.out.println("student is " + student);

        Student student1= (Student) factory.getBean("student1");
        System.out.println("student1 is " + student1);

    }
}

/*

BeanFactory.getBean() --> always return  an object of return type of Object


*/