package oops;

public class PublicEx
{
	
	public int a3= 10;
	public void displayA3()
	{
		System.out.println("The value of a3 is "+a3);
	}

	public static void main(String[] args) 
	{
				
		PublicEx pub = new PublicEx();
		pub.displayA3();

	}

}
