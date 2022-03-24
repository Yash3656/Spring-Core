package org.com.springcore;

public class Employee extends Person{
	int employeeNumber;
	int employeeAge;
	String employeeContactNo;
	
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeContactNo() {
		return employeeContactNo;
	}
	public void setEmployeeContactNo(String employeeContactNo) {
		this.employeeContactNo = employeeContactNo;
	}
	
    public int getEmployeeNumber() {
       return employeeNumber;
   }
    public void setEmployeeNumber(int employeeNumber) {
       this.employeeNumber = employeeNumber;
   }

}
