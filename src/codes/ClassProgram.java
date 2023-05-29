package codes;

public class ClassProgram {
	int num=5;
	int result;
	public void multTwoNumbers(int a,int b)
	{
		result=a*b;
		System.out.println("Multiplication of a & b is "+result);
	}
	
	public static void main(String[] args)
	{
		ClassProgram obj1=new ClassProgram();
		System.out.println(obj1.num);
		
		obj1.multTwoNumbers(10,10);
		
		/*
		//Accessing the default member from outside of the package(oops). wont able to access because is outside its package(oops)
		A1 obj1= new A1();
		*/
		
		
	}

}
