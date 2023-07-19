package codekata;

import java.util.Scanner;

public class SumIsEvenOrodd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r=a+b;
		if(r%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
