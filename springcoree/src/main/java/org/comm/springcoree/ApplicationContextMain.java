package org.comm.springcoree;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextMain{
	
public static void main(String[] args) {
	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Country countryObj = (Country) appContext.getBean("country");
		System.out.println(countryObj.getCountryName() +"'s"+" Capital Name:- "+countryObj.getCapitalName("capital"));
	}
}