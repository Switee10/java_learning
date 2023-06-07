package oops;

//this() can be used to invoke current class constructor.

class car11
{
	car11()
	{
		
		System.out.println("This is default constructor");
		
	}
	car11(String Name)
	{
		this();
		System.out.println("Car name is "+Name);
	}
}

public class ThisConstructor {

	public static void main(String[] args)
	{
		car11 c=new car11("Indica");

	}

}
