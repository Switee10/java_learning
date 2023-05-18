package basics;

public class FactorialUsingClass {

	/*
//accessmodifier returnType mathodName(arguments)
	{
		
	}
	*/
	public void factorial(int factorialNumber)
	{
		int factorialResult=1;
		for(int i=1;i<=factorialNumber;i++)
		{
			factorialResult= factorialResult*i;
		}
		System.out.println("Factorial of a number: "+factorialNumber+" is "+factorialResult);
		
	}
	
	
	public static void main(String args[])
	{
		FactorialUsingClass obj1= new FactorialUsingClass();
		obj1.factorial(5);
		
		FactorialUsingClass obj2= new FactorialUsingClass();
		obj2.factorial(10);

		
	}

}
