package corejava;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		LinkedList<String> ll1=new LinkedList<String>();
		
		ll.add("java");
		ll.add(true);
		ll.add(null);
		ll.add(45);
		ll.add(45.9);
		
		System.out.println("After inserting elements in linked list"+ll);
		
		ll.remove(3);
		System.out.println("remove element"+ll);
		
		ll.add(3, 55);
		System.out.println("Adding element"+ll);
		
		System.out.println(ll.get(0));
		
		ll.set(1, "python");
		System.out.println("After replacing the value at index 1-->"+ll);
		
		System.out.println(ll.contains("java")); //true
		System.out.println(ll.contains("pascal")); //false
		
		System.out.println("================");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("================");
		for(Object data:ll)
		{
			System.out.println(data);
		}
		System.out.println("================");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
