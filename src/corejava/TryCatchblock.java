package corejava;


public class TryCatchblock {

	public static void main(String[] args) 
	{
		//to handle the simpleException program error,we use try catch block to handle the exception 
		int a,b,c;
		a=10;b=0;
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}

/*
 * try
 * {
 *		code which will throw exception
 * }
 * catch(Exception ex)
 * {	
 * 	thrown exception would be caught here
 * 
 * }
 */
