package corejava;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) 
	{
		try
		{
			String str="Java programming";
			str.charAt(20);
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
