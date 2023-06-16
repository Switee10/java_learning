package oops;

//this() can be used to invoke current class constructor.

class car12
{
	car12()
	{
		
		System.out.println("This is default constructor");
		
	}
	car12(String Name)
	{
		this();
		System.out.println("Car name is "+Name);
	}
}

public class ThisConstructor {

	public static void main(String[] args)
	{
		car12 c=new car12("Indica");

	}

}
