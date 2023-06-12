package oops;

//Abstract class can have both abstract and non-abstract methods
//we cannot create object for an abstract class instead we cant create object for its implementing class(AbstractClassEx)

//If we are not defining (writing logic) a method, then that method becomes an abstract method

abstract class Bike5
{
	abstract void gear();
	
	void accelerator()
	{
		System.out.println("Accelerating bike");
	}
}
abstract class Bike6 extends Bike5
{
	abstract void changecolor();
	
	void Break()
	{
		System.out.println("Brake applied");
	}
}
public class AbstractClass extends Bike6 
{
	
	void gear() 
	{
		System.out.println("changing the gear");
	}
	
	
	void changecolor()
	{
		System.out.println("Bike color is Black");
		
	}

	public static void main(String[] args) 
	{
		AbstractClass ab=new AbstractClass();
		ab.accelerator();
		ab.gear();
		ab.Break();
		ab.gear();
		
		//cannot create object or instance to an abstract class(Bike5)
		//Bike5 b=new Bike5();
	}

	

	

}
