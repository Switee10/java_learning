package corejava;

import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		LinkedList<Integer> al1 = new LinkedList<Integer>();
		System.out.println("Before adding in linkedlist al1"+al1);

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(40);
		
		al1.addAll(al);
		System.out.println("After adding in Arraylist al1"+al1);
		
		al1.removeAll(al);
		System.out.println("After deleting values from al1-->"+al1);
		
		
		Collections.sort(al);
		System.out.println("After sorting-->"+al);//[A, B, C, X, Y]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Sorting in reverse order-->"+al);//[Y, X, C, B, A]
		
		Collections.shuffle(al);
		System.out.println("After shuffling-->"+al);//[X, A, B, Y, C]

	}

}
