package corejava;
import java.util.*;

public class LinkedListStackQueue {

	public static void main(String[] args) 
	{
		LinkedList<Integer> s=new LinkedList<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println("Linked list before "+s);
		
		s.addFirst(5);
		System.out.println("After adding element at the first"+s);
		
		s.addLast(50);
		System.out.println("After adding element at the last"+s);
		
		s.removeFirst();
		System.out.println("After removing element from the first index"+s);
		
		s.removeLast();
		System.out.println("After removing element from the last index"+s);

		
		System.out.println("get first element-->"+s.getFirst());
		
		System.out.println("get last element-->"+s.getLast());

	}

}
