package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.springcore.ApplicationConfiguration;

public class SpringJavaConfigMain {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		  ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		  Student studentObj = (Student) appContext.getBean("countryObj");
		  String studentName=studentObj.getStudentName();
		  int studentId=studentObj.getStudentId();
		  String studentAddress=studentObj.getStudentAddress();
		  
		  System.out.println("Student Id: "+ studentId);
		  System.out.println("Student Name: "+ studentName);

		  System.out.println("Student Address: "+ studentAddress);


	}

}
