package com.medium.dependencyInjection.setter;

/**
 * Created by svmga on 01-Apr-17.
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
    public static void main(String[] args) {

//        Resource resource = new ClassPathResource("dependencyInjectionSetter.xml");
        Resource resource = new ClassPathResource("dependencyInjectionConstructor.xml");

        BeanFactory factory = new XmlBeanFactory(resource);

        Student student1 = (Student) factory.getBean("studentbean");
        Student student=(Student)factory.getBean("studentbean");
        student.displayInfo();
        //student1.setName("Antra");
        student1.displayInfo();
        System.out.println(student1 + "        " + student);
    }
}

/*

BeanFactory.getBean() --> always return  an object of return type of Object


*/