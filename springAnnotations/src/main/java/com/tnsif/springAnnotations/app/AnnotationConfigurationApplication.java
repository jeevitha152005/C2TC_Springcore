package com.tnsif.springAnnotations.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AnnotationConfigurationApplication {
	public static void main(String...args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MusicTeacher obj= context.getBean("getTeacherInfo",MusicTeacher.class);
		obj.setName("Shyam singha roy");
		System.out.println(obj.getTeacherInfo());
	}		
}