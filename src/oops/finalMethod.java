package oops;
//When we add final keyword to the method, then that method cannot be overrided in the subclass

class mobile
{
	final void display()
	{
		System.out.println("mobile is vivo");
	}
}
public class finalMethod extends mobile
{
	//void display()
	{
		System.out.println("mobile is OPPO");

	}

	public static void main(String[] args)
	{
		finalMethod m1=new finalMethod();
		m1.display();

	}

}
