package codekata;

import java.util.Scanner;
public class Evenodd {
	 
    public static void main(String[] args) {
    	//int v=0;;
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
       // int v=parseInt(n);
       //int v;
        //if(n==v)
        {
          //  v = (int) n;
            //System.out.println("v");
           
        }
         if(n==0)
        {
            System.out.println("zero");

        }else if(n%2==0)
        {
                        System.out.println("Even"); }
        else
        {
            System.out.println("odd");

        }
    }
}
