package oops;

class vehiclespeed
{
	int vehiclespeed;
	vehiclespeed()
	{
		System.out.println("Inside constructor");
		System.out.println(vehiclespeed);
	}
	//instanceBlock
	{
		vehiclespeed=120;
		System.out.println("instance block");
		
	}
	static
	{
		System.out.println("static block");
	}
}

public class StaticInstanceBlock {

	public static void main(String[] args) 
	{
		vehiclespeed v=new vehiclespeed();
		
	}

}
