package oops;

//this can be used to refer current class instance variable.

class employee
{
	int id;
	String name;
	String Emptype;


	employee(int empid,String Empname,String EmpType1)
	{
		id=empid;
		name=Empname;
		Emptype=EmpType1;

	}
	void DisplayempData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(Emptype);
	}

}
public class ThisKeyword2 
{

	public static void main(String[] args) 
	{
		employee e=new employee(101,"Rakesh","Fulltime");
		e.DisplayempData();

	}
}























/*class Student3
{
	
	int rollNo1;
	String name1;
	int marks1;
	
	Student3(int roll, String name, int marks)
	{ 
		rollNo1= roll;
		name1 = name;
		marks1=marks;
	}
	
	void displayStudentData()
	{
		System.out.println("The Student rollno is "+rollNo1+" and his name is " +name1+" marks are "+marks1);

	}
}

public class ThisKeyword2 {

	public static void main(String[] args) 
	{
		Student3 obj = new Student3(1,"Ram",78);
		obj.displayStudentData();
	}

}
*/