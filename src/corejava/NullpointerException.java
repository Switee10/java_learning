package corejava;

public class NullpointerException {

	public static void main(String[] args) 
	{
		try
		{
			String s=null;
			System.out.println(s.charAt(2));
		}
		/*catch(NullPointerException ex)
		{
			System.out.println(ex);
		}*/
		//if we dont know what type of exception is this then we have to check the exception type using exception class
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
