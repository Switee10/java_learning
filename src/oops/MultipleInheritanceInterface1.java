package oops;

interface Car4
{
	String carcolor="blue";
	void carColor();
}

interface Car3
{
	void brake();
}

public class MultipleInheritanceInterface1 implements Car4,Car3
{
	public void brake() 
	{
		System.out.println("Brake applied ");
		
	}

	public void carColor()
	{
		System.out.println("car color is "+carcolor);
		
	}
	
	public static void main(String[] args) 
	{
		MultipleInheritanceInterface1 obj =new MultipleInheritanceInterface1();
		obj.carColor();
		obj.brake();
	}

	

}
