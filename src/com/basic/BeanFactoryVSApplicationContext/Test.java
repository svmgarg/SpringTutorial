package com.basic.BeanFactoryVSApplicationContext;

/**
 * Created by svmga on 01-Apr-17.
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;


public class Test {
    public static void main(String[] args) {

       /* Resource resource = new ClassPathResource("BeanFactoryVSApplicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        System.out.println("Making Bean using Bean Factory");
        Student student = (Student) factory.getBean("studentbean");
        */


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanFactoryVSApplicationContext.xml");
        //applicationContext.getBean("studentbean");
        }
}

/*

BeanFactory.getBean() --> always return  an object of return type of Object


*/