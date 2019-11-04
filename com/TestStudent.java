package com;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*; 

public class TestStudent {
	public static void main(String[] args) {  
        Resource r=new ClassPathResource("ApplicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Student stu=(Student)factory.getBean("e1");  
        stu.display1();
        Student student=(Student)factory.getBean("e2");  
        student.display2();
	}
}
