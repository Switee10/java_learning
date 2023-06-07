package codes;

class flower
{
	void rose()
	{
		System.out.println("rose is red");
	}
}
class flower1 extends flower
{
	void rose()
	{
		System.out.println("rose");
	}

}


public class MethodOverriding extends flower
{
	void rose()
	{
		System.out.println("rose is flower");
	}

	public static void main(String[] args)
	{
		MethodOverriding obj=new MethodOverriding();
		obj.rose();
		
		flower f=new flower();
		f.rose();
		
		flower1 f1=new flower1();
		f1.rose();

	}

}
