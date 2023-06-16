package oops;

//super() can be used to invoke immediate parent class constructor.
//If we dont call the parent class constructor explicitly in the child class, child class constructor would call the parent class constructor implicitly

class Car11
{
	Car11()
	{
		System.out.println("Parent class constructor");
	}
}

class Hyundai extends Car11
{
	Hyundai()
	{
		//super();
		System.out.println("Child class constructor");
		
	}
}


public class SuperConstructor {

	public static void main(String[] args)
	{
		Hyundai cons= new Hyundai();

	}

}
