package assignments;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAss {

	public static void main(String[] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(10);
		l1.add(15);
		l1.add(30);
		l1.add(25);
		System.out.println(l1);
		
		l1.addFirst(5);
		System.out.println("Add first"+l1);
		l1.addLast(50);
		System.out.println("Add last"+l1);
		
		for(Object ob:l1)
		{
			System.out.println(ob);
		}
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Reverse order"+l1);
		
		l1.add(2, 20);
		System.out.println("Add element at specified position"+l1);
		
		l1.set(1, 45);
		System.out.println("set element at "+l1);
		
		
		System.out.println("get first element--"+l1.getFirst());
		System.out.println("get last element--"+l1.getLast());
		
		for(int p=0; p < l1.size(); p++)
		   {
		      System.out.println("Element at index "+p+": "+l1.get(p));
		    } 
		
		l1.remove(3);
		System.out.println("Remove element from specified index"+l1);
		
		l1.removeFirst();
		System.out.println("Remove first"+l1);
		
		l1.removeLast();
		System.out.println("remove last"+l1);
		
		//l1.removeAll(l1);
		//System.out.println(l1);
		
		Collections.swap(l1, 0, 1);
		System.out.println("After swapping"+l1);
	   
		Collections.shuffle(l1);
		System.out.println("Shuffle elements"+l1);
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(70);
		l2.add(65);
		l2.addAll(l1);
		System.out.println("Join"+l2 );
		
		l2.clone();
		System.out.println("clone"+l2);
		
		int a=l2.remove(0);
		System.out.println("removed element--"+a);
		System.out.println("LinkedList"+l2);
		
		int x=l2.peekFirst();
		System.out.println("retrive--"+x);
		System.out.println(l2);
		
		int y=l2.peekLast();
		System.out.println("retrive--"+y);
		System.out.println(l2);
		
		System.out.println(l1.contains(20));
		System.out.println(l1.contains(35));

		//Write a Java program to convert a linked list to an array list.
		//Object[] a = l2.toArray();
		 //for (Object element : a)
	       //     System.out.print(element + " ");
	    
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		//Write a Java program to compare two linked lists and print the linked list
		/*l3.add(22);
		for (Integer e : l1)
		{
			l3.add(l2.contains(e) );
		}
		System.out.println(l3);
		 */
		System.out.println(l2.isEmpty());
		System.out.println(l3.isEmpty());
		
		l1.set(2, 100);
		System.out.println("Replace the element"+l1);

		
	}

}
