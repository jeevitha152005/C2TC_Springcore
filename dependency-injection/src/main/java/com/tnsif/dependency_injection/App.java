package com.tnsif.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student thamizh=con.getBean("tamil",Student.class);
		Student kalai=con.getBean("kalai",Student.class);
		
		thamizh.showInfo();
		kalai.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("sakthi",Student1.class);
		Student1 hm=con.getBean("hema",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}