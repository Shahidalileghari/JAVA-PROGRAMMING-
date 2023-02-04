package com.split;
 

    class EmployeeManagmenet{
    	private String firstname;
    	private String  lastname;
    	private double salaryhike; 
    	private double salary;
    	   double totalsalary=0;
    	
    	
    	public void setdetails(String fname, String lastname, double salary)
    	{
    		this.firstname=fname;
    		this.lastname=lastname;
    		this.salary=salary;
    		
    	}
    	
    	
    	public String getfirstname()
    	{
    		return firstname;
    	}
    	
    	public String getlastname()
    	{
    		return lastname;
    	}
    	
    	public double getsalary()
    	{
    		return salary;
    	}
    	
    	public void setsalaryhike(double hike)
    	{
    		this.salaryhike=hike;
    	}
    	
    	public double hike()
    	{
    		if(salary>0)
    		{
    			totalsalary=(salary*salaryhike)/100+salary;
    			
    			return totalsalary;
    		}
    		
    		return 0;
    	}
    	
    	public void display()
    	{
    		System.out.println("Employee first name:"+this.firstname);
    		System.out.println("Employee lastname  :"+this.lastname);
    		System.out.println("Salary of employee :"+this.salary);
    	}
    	
    	
    	
    	
    	
    }
public class Employee_Q2 {

	public static void main(String[] args) {
		
     EmployeeManagmenet employeeManagmenet=new EmployeeManagmenet();
     
     employeeManagmenet.setdetails("Ali", "Ahmed", 30000);
     
     employeeManagmenet.setsalaryhike(20);
   
     
     employeeManagmenet.display();
     
     System.out.println(   "Salary raised :"+ employeeManagmenet.hike());
    
     
     
   
	}

}
