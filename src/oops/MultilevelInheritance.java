package oops;


class Animal1
{
	String Animalname="Dog";
	public void eat()
	{
		System.out.println("Animal is Eating");
	}
}
class dog1 extends Animal1
{
	public void bark()
	{
		System.out.println("Dog is barking");

	}
}
class cat extends dog1
{
	public void meow()
	{
		System.out.println("Meow");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		cat c=new cat();
		c.meow();
		c.bark();
		c.eat();

	}

}
