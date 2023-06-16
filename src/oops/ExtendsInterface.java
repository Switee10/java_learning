package oops;

//Extends Two Interfaces

interface car13
{
	void display13();
}

interface car14 extends car13
{
	void display14();
}

public class ExtendsInterface implements car14
{
	
	public void display13()
	{
		System.out.println("This is first interface");
		
	}

	
	public void display14() {
		
		System.out.println("This is second interface");
	}


	public static void main(String[] args) 
	{
		ExtendsInterface obj =new ExtendsInterface();
		obj.display13();
		obj.display14();

	}

	
}
