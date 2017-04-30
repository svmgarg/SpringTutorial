package com.basic.autowire;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	
	public static void main(String[] args) {
//		XmlBeanFactory factory = new XmlBeanFactory(new  ClassPathResource("AutowiringByType.xml"));
//		XmlBeanFactory factory = new XmlBeanFactory(new  ClassPathResource("AutowiringByName.xml"));
		XmlBeanFactory factory = new XmlBeanFactory(new  ClassPathResource("AutowiringByConstructor.xml"));
		Employee employee = (Employee)factory.getBean("employee");
		System.out.println("Employee is ....\n"+ employee);
	}
}
