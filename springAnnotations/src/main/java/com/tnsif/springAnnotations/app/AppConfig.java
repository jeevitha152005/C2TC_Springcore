package com.tnsif.springAnnotations.app;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	@Bean
	public MusicTeacher getTeacherInfo() {
		return new MusicTeacher();
	}
	
}