package basics;

public class AssignmentOperators {

	public static void main(String args[])
	{
		/*
		 * Assign the value to a variable( assign the right hand side value to the left hand side variable)
		 * 
		 * =
		 * +=
		 * -=
		 * *=
		 * (/=)
		 * %=
		 * 
		 */

		int num1=5,num2=20,num3=2,num4=8;
		
		num1+=5;
		
		num2-=10;
		
		num3*=10;
		
		num4/=2;

		//num1%=5; //num1= num1%5;
		//num1= num1+5;
		System.out.println("+=-->"+num1);
		System.out.println("-=-->"+num2);
		System.out.println("*=-->"+num3);
		System.out.println("/=-->"+num4);



	}

}
