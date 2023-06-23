package assignments;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many rows u want");
		int s=sc.nextInt();
		int i;
		for(i=1;i<=s;i++)
		{
			for(int j=1;j<i;j++)
				System.out.println();
		}
		for(int j=i;j<=s;j++)
		{
			System.out.println("*");
		}
			System.out.println();
	}

}
