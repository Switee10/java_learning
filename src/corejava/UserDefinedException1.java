package corejava;

public class UserDefinedException1
{
	static void ValidateMark(int marks)
	{
		try
		{
			if(marks<40)
			{
				throw new MarkValidation(); 
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception");
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		ValidateMark(20);
	}

}
class MarkValidation extends Exception
{
	MarkValidation()
	{
		System.out.println("Students mark should be greater than 40");
	}
	MarkValidation(String str)
	{
		System.out.println(str);
	}
}