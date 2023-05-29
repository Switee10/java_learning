package oops;

class Animal			//parent class
{
	String Animalname="dog";
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}
class dog extends Animal		//child class
{
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}

public class SingleInheritance {

	public static void main(String[] args) 
	{
		dog d=new dog();
		d.bark();
		d.eat();
		System.out.println(d.Animalname);
	}

}
