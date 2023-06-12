package oops;

class employeedetails
{
	private String employeename;
	private int employeeage;
	
	//this two variables we are set as private so we are not able to access this variables
	//but if we want to access this variables then we have to use getter and setter methods
	
	//setter methods
	public void setEmployeename(String name)
	{
		employeename = name;
	}
	public void setEmployeeage(int age)
	{
		employeeage =age;
	}
	
	//getter methods
	public String getEmployeename() 
	{
		return employeename;
	}
	public int getEmployeeage()
	{
		return employeeage;
	}
	
	
	
}

public class Encapsulation
{

	public static void main(String[] args)
	{
		employeedetails emp = new employeedetails();
		emp.setEmployeename("Arun");
		emp.setEmployeeage(30);
		
		System.out.println(emp.getEmployeename());
		
		System.out.println(emp.getEmployeeage());
		
		

	}

}
