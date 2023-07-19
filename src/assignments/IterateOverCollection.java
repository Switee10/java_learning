package assignments;
import java.util.*;
public class IterateOverCollection {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(null);
		a.add("sweety");
		System.out.println(a);
		System.out.println("==================");
		for(Object data:a)
		{
			System.out.println(data);
		}
		System.out.println("==================");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("==================");
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
