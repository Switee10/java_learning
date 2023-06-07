package oops;

//If we declare a class ad final, we cannot inherit that specific class 
 class mobile1
{
	void display()
	{
		System.out.println("Mobile is Nokia");
	}
}
public class FinalClass extends mobile1
{
	
	public static void main(String[] args) 
	{
	mobile1 m=new mobile1();
	m.display();

	}

}
