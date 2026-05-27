package com.mca;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		CSK c = app.getBean(CSK.class);
		c.show();
		
		app.close();
	}
}
