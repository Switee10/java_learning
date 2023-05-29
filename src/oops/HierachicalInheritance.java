package oops;

class Animal2
{
	void eat()
	{
		System.out.println("Animal is Eating");
	}
}
class dog2 extends Animal2		//hierarchy 1
{
	void bark()
	{
		System.out.println("Dog is Barking");

	}
}
class cat2 extends Animal2		//hierarchy 2
{
	void meow()
	{
		System.out.println("meow");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args)
	{
		dog2 d2=new dog2();
		d2.eat();
		d2.bark();
		
		cat2 c2=new cat2();
		c2.meow();
		c2.eat();
		
		
		
		
	}

}
