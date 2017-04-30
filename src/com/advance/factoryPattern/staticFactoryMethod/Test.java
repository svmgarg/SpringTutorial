package com.advance.factoryPattern.staticFactoryMethod;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by svmga on 02-Apr-17.
 */
public class Test {
    public static void main(String arg[]) {

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("FactoryPatternStaticFactoryMethod.xml"));
        Employee manager  = (Employee) xmlBeanFactory.getBean("manager");
        System.out.println(manager);
        Employee developer= (Employee) xmlBeanFactory.getBean("developer");
        System.out.println(developer);
        Employee tester = (Employee) xmlBeanFactory.getBean("tester");
        System.out.println(tester );
    }
}
