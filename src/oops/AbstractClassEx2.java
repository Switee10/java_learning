package oops;

abstract class shape
{
	//Abstract class can have constructor and its variables can be final, static , non-final and non-static.

	shape()
	{
		System.out.println("This is default constructor");
	}
	
	int a=20;
	final String name="Sweety";
	static String place="Nashik";
	
	abstract void draw();
	
}

class Circle extends shape
{
	void draw()
	{
		System.out.println("Draw circle");
		
		
	}
	
}
class triangle extends shape
{
	void draw()
	{
		System.out.println("Draw Triangle");
		
	}
	
}

public class AbstractClassEx2 {

	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.draw();
		
		triangle t=new triangle();
		t.draw();

	}

}
