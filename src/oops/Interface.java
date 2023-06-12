package oops;
/*
 * Syntax for creating an interface
 * 
interface interfaceName
{
	
}
*/

interface Bike7
{
	void gear();
	void Accelerate();
}

public class Interface implements Bike7
{
	
	public void gear()
	{
		System.out.println("Changing the gear");
		
	}

	
	public void Accelerate() 
	{
		System.out.println("Accelerating Bike");
		
	}


	public static void main(String[] args) 
	{
		Interface in=new Interface();
		in.Accelerate();
		in.gear();

	}

	
}
