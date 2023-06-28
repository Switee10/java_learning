package codekata;


import java.util.Scanner;

public class EquiTri {
	
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;++i)
        {
        	 sum=sum+i;
        	
        }
        System.out.println(sum);
	}

}
