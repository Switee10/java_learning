package assignments;

class overriding1
{
	void override()
	{
		System.out.println("First class");
	}
}

public class Overriding  extends overriding1
{
	void override()
	{
		System.out.println("Second method");
	}

	public static void main(String[] args) 
	{
		Overriding o=new Overriding();
		o.override();
	}

}
