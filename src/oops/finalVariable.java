package oops;

/*
 * Java Final keyword is used to restrict the user and it can be used along with Variables, methods and classes
 */

//When i have declared a variable as final, i cannot change its value


public class finalVariable
{
	final int rollno=9;
	void display()
	{
		//rollno=10;
		System.out.println(rollno);
	}

	public static void main(String[] args) 
	{
		finalVariable f1=new finalVariable();
		f1.display();

	}

}
