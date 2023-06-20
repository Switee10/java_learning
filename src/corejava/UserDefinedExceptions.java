package corejava;

public class UserDefinedExceptions {

	public static void main(String[] args)
	{
		try
		{
			int a=10;
			String str="abc";
			System.out.println(Integer.parseInt(str));
		}
		catch(Exception ex)
		{
			System.out.println("User defined exception message--> Number format exception");
			System.out.println(ex);
	
		}
		

	}

}
