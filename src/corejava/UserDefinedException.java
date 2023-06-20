package corejava;

public class UserDefinedException 
{
	int age;
	static void Validateage(int age)
	{
		try
		{
			if(age<=18)
			{
				throw new AgeArithmetic();
			}
		}
			catch(Exception ex)
			{
				System.out.println("Inside catch Block");
				ex.printStackTrace();
			}

		}
	

	public static void main(String[] args)
	{
		Validateage(10);
	}

}
class AgeArithmetic extends Exception
{
	AgeArithmetic()
	{
		System.out.println("Age should be greater than 18");
	}
	AgeArithmetic(String str)
	{
		System.out.println(str);
	}
}

/*
//User defined Exception
1) user defined class should extend the Exception class
2) We should constructors for throwing the exception in the user defined exception class
3) We can have both default and parameritized constructors

 */
