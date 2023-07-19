package assignments;
import java.util.*;

public class CollectionAssi {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(20);
		a.add(40);
		a.add(50);
		a.add(40);
		a.add(70);
		a.add(70);
		a.add(10);
		a.add(15);
		System.out.println("ArrayList--"+a);
		
        HashSet<Integer> hset = new HashSet<Integer>(a);
        System.out.println("Unique Values--"+hset);

		
		
	}

}
