package com.springcore;
	
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	import com.springcore.Student;

		@Configuration
		public class ApplicationConfiguration {
		 
		@Bean(name="countryObj")
		public Student getCountry()
		{
		  return new Student(111, "Yash Agrawal", "Nashik");
		}
		}


