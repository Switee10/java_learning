package assignments;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows u want");
		int s=sc.nextInt();
		for(int i=1;i<s;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(" * ");
			}
			System.out.print("\n");
		}


	}
/*
 * row-->i
 * 
 * 		1	2	3	4	5
 * 1	*
 * 2	*	*
 * 3	*	*	*
 * 4	*	*	*	*
 * 5	*	*	*	*	*
 *
 * 
 * */
 
}
