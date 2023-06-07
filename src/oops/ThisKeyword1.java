package oops;

class Student2
{
	//instance variables
	int rollNo1;
	String name1;
	int marks1;
	
	Student2(int rollNo1, String name1, int marks1)
	{
		this.rollNo1= rollNo1; 
		this.name1 = name1; 
		this.marks1=marks1;
	}
	
	void displayStudentData()
	{
		System.out.println("The Student rollno is "+rollNo1+" and his name and marks are "+name1+" "+marks1);

	}
}

public class ThisKeyword1 
{

	public static void main(String[] args)
	{
		Student2 obj = new Student2(3,"sham",90);
		obj.displayStudentData();

	}

}
