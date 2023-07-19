package assignments;
import java.util.*;

public class JoinTwoArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("first array list--"+al);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(60);
		al1.add(70);
		al1.add(80);
		al1.add(90);
		al1.add(100);
		System.out.println("second array list--"+al1);
		
		al.addAll(al1);
		System.out.println("joined array list--"+al);
		
		
	}

}
