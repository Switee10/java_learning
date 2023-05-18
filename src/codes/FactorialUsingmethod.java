package codes;

public class FactorialUsingmethod {
	
	
	public int Factorial(int factnum)
	{
		int factres=1;

		for(int i=1;i<=factnum;i++)
		{
			factres=factres*i;
		}
		//System.out.println("Factorial of 6 is "+factres);	
		return factres;
	}
	public static void main(String[] args)
	{
		FactorialUsingmethod obj3=new FactorialUsingmethod();
		int result=obj3.Factorial(6);
		System.out.println("Factorial 0f 6 is "+result);
	}

}
