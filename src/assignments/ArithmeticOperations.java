package assignments;


public class ArithmeticOperations 
{
    int num=5;
	
	public int addTwoNumbers(int a,int b)
	{
		int result1=a+b;
		return result1;
	}
	public int subTwoNumbers(int a,int b)
	{
		int result2=a-b;
		return result2;
	}
	public int divTwoNumbers(int a,int b)
	{
		int result3=a/b;
		return result3;
	}
	public int multTwoNumbers(int a,int b)
	{
		int result4=a*b;
		return result4;
	}
	public int modTwoNumbers(int a,int b)
	{
		int result5=a%b;
		return result5;
	}
	
	
	public static void main(String[] args)
	{
		ArithmeticOperations obj1=new ArithmeticOperations();
		
		
		int result1=obj1.addTwoNumbers(10,10);
		System.out.println("Addition is :"+result1);
		
		int result2=obj1.subTwoNumbers(10,10);
		System.out.println("Substraction is :"+result2);
		
		int result3=obj1.divTwoNumbers(10,10);
		System.out.println("Division is :"+result3);
		
		int result4=obj1.multTwoNumbers(10,10);
		System.out.println("Multiplication is :"+result4);
		
		int result5=obj1.modTwoNumbers(10,10);
		System.out.println("Mod  is :"+result5);
		

	}

	

}













/*
 * Everythig should be done using return statement
 * Addition of 2 nos
 * sub of 2 nos
 * div of 2 nos
 * mul of 2 nos
 * % of 2 nos
 * 
 */