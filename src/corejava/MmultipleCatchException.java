package corejava;

public class MmultipleCatchException {

	public static void main(String[] args) 
	{
		try
		{
			String s=null;
			System.out.println(s.charAt(1));
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex);
		}

	}

}
