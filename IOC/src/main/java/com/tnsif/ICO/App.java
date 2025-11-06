package com.tnsif.ICO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App {
    public static void main(String[] args) {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
    	System.out.println("loaded");
    	Mobile mobile = context.getBean("mobile", Mobile.class);
    	mobile.call();
    	mobile.data();
    }
}