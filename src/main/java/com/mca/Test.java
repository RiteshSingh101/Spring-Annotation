package com.mca;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(ConfigApp.class);
		
		Student student = (Student)app.getBean("student");
		student.play();
		
		Employee e = (Employee)app.getBean("employee");
		e.work();
		
		EmployeeService e1 = (EmployeeService) app.getBean("employeeService");
		e1.working();
		
		RCB r = (RCB)app.getBean("myRCB");
		r.cup();
		
		app.close();
	}
}
