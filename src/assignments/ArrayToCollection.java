package assignments;

import java.util.*;

public class ArrayToCollection {

	public static void main(String[] args) 
	{
		String[] array= {"ram","sham","gita","sita","sid"};
		System.out.println("Given array"+Arrays.toString(array));
		
		List arrayList=Arrays.asList(array);
		System.out.println("collection-"+arrayList);
		
		Collections.shuffle(arrayList);
		System.out.println(arrayList);
	}

}
