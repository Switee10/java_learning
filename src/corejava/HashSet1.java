package corejava;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) 
	{
		//for heterogeneous dataset
		HashSet hs=new HashSet();
		
		//for mentioning size
		HashSet hs1=new HashSet(100);
		
		//Mentioning the memory and the fill ratio
		HashSet hs2 = new HashSet(100,(float)0.90);
		
		//for homogeneous data
		HashSet<Integer> hs3= new HashSet<Integer>();
		
		hs.add("java");
		hs.add(null);
		hs.add(true);
		hs.add(20);
		hs.add("python");
		
		System.out.println(hs);
		
		hs.remove("java");
		System.out.println(hs);
		
		hs.add("10");
		hs.add(false);
		hs.addAll(hs);
		System.out.println(hs);
		
		System.out.println("check for empty set -->"+hs.isEmpty());
		System.out.println("check for not empty set -->"+hs1.isEmpty());
		
		
		System.out.println(hs.contains("python")); 
		System.out.println(hs.contains("pascal")); 
		
		System.out.println("-------------------");

		for(Object data:hs)
		{
			System.out.println(data);
		}
		
		System.out.println("-------------------");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-------------------");
		
		HashSet<Integer> hs4=new HashSet<Integer>();
		HashSet<Integer> hs5=new HashSet<Integer>();
		System.out.println(hs4);
		
		hs4.add(10);
		hs4.add(20);
		hs4.add(30);
		hs4.add(45);
		hs5.addAll(hs4);
		hs5.add(50);
		System.out.println("After add--"+hs4);
		System.out.println("After add--"+hs5);
		
		//hs5.removeAll(hs4);
		System.out.println("after removing--"+hs5);

		//System.out.println(hs5.containsAll(hs4));
		hs5.retainAll(hs4);
		System.out.println(hs5);
		
	}

}
