package corejava;

public class ThrowException {

	public static void main(String[] args) 
	{
		ThrowExample.ThrowEx(10);
	}
}
class ThrowExample
{
	static void ThrowEx(int age)
	{
		if(age<=18)
		{
			throw new ArithmeticException("Age must be greater than 18");
		}
		else
		{
			System.out.println("Age is greater than 18");
		}
	}
}
