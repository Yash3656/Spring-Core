/*
 * package org.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceInSpringMain {
	
    public static void main(String[] args) {
    	
    ApplicationContext appContext = new    ClassPathXmlApplicationContext("ApplicationContext.xml");
    Employee emp=(Employee) appContext.getBean("employeeBean");
    System.out.println("Employee name:"+emp.getName());
    System.out.println("Employee number:"+emp.getEmployeeNumber());
    }
}
*/
/* Change above program to get below output

Employee name:YourName
Employee number:1111
*/
/*
package org.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceInSpringMain {
	
    public static void main(String[] args) {
    	
    ApplicationContext appContext = new    ClassPathXmlApplicationContext("ApplicationContext.xml");
    Employee emp=(Employee) appContext.getBean("employeeBean");
    System.out.println("Employee name:"+emp.getName());
    System.out.println("Employee number:"+emp.getEmployeeNumber());
    }
}
*/
/*Change above program to show employee name , employee age and its contact number.*/

package org.com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritenceInSpringMain {
	
    public static void main(String[] args) {
    	
    ApplicationContext appContext = new    ClassPathXmlApplicationContext("ApplicationContext.xml");
    Employee emp=(Employee) appContext.getBean("employeeBean");
    System.out.println("Employee name:"+emp.getName());
    System.out.println("Employee age:"+emp.getEmployeeAge());
    System.out.println("Employee contact-no:"+emp.getEmployeeContactNo());

    }
}
