package corejava;

import java.util.*;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();//Doesnt maintain insertion order
		LinkedHashSet lhs=new LinkedHashSet();//maintains the insertion order
		
		lhs.add(20);
		lhs.add(45);
		
		hs.add(10);
		hs.add(67);
		hs.add(null);
		hs.add(45);
		
		System.out.println(lhs);
		
		hs.add(48);
		System.out.println("Add elememt at last--"+lhs);
		
		System.out.println("iterate==");
		for(Object data:hs)
		{
			
			System.out.println(data);
		}
		System.out.println("Size is--"+hs.size());
		//System.out.println("Empty set--"+hs.removeAll(hs));
		
		System.out.println("Check Isempty--"+hs.isEmpty());
		
		hs.clone();
		System.out.println(hs);
		
		//Write a Java program to convert a hash set to an array.
		 Integer[] array = new Integer[hs.size()];
	      hs.toArray(array);
	      for(Integer element : array){
	          System.out.println(element);
	      }
	      //Write a Java program to convert a hash set to a tree set.

	     Set<Integer> ts = new TreeSet<Integer>(hs);
	      ts.add(1);
	      ts.add(2);
	      ts.add(3);
	      ts.add(8);
	      ts.add(9);
	       //System.out.println("TreeSet elements: ");
	      //for(Integer element : tree_set){
	        // System.out.println(element);
	      //}
	      //Write a Java program to find numbers less than 7 in a tree set.
	      //Write a Java program to compare two hash set.
	      TreeSet <Integer>treeheadset = new TreeSet<Integer>();

	     // treeheadset = (TreeSet)ts.headSet(7);  

	}

}
