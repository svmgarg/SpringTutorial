package com.basic.HandlingCollections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.util.ResourceBundle;

/**
 * Created by svmga on 04-Apr-17.
 */
public class Test {
    public static void main(String args[]){

        Resource resource = new FileSystemResource("src/com/basic/HandlingCollections/InjectingCollection.xml");
        BeanFactory  factory = new XmlBeanFactory(resource);
        Exam  ocjpExam = (Exam) factory.getBean("ocjp");
        System.out.println(ocjpExam);

    }
}
