package assignments;
import java.util.*;

public class AssOnArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> str=new ArrayList<String>();
		ArrayList<String> str1=new ArrayList<String>();

		
		str.add("Red");
		str.add("pink");
		str.add("blue");
		str.add("voilet");
		str.add("Yellow");
		System.out.println(str);
		
		for(Object data:str)
		{
			System.out.println(data);
		}
		
		str.add(0, "Black");
		System.out.println("Add Element At first Position"+str);
		
		
		System.out.println(str.get(0));
		
		str.set(1, "White");
		System.out.println("Update element"+str);
		
		str.remove(2);
		System.out.println("Remove element"+str);
		
		System.out.println("Search Element-->"+str.contains("Black"));
		
		Collections.sort(str);
		System.out.println("After sorting"+str);
		
		str1.addAll(str);
		System.out.println(str1);
		
		Collections.shuffle(str);
		System.out.println("shuffle elements"+str);
		
		Collections.sort(str,Collections.reverseOrder());
		System.out.println("Reverse order"+str);
		
		//Write a Java program to extract a portion of an array list.
		List<String> str2 = str.subList(0, 3);
		System.out.println("Extract portion"+str2);
		
		System.out.println("compare two array lists"+str2.equals(str1));
		
		System.out.println("Original string"+str);
		Collections.swap(str, 0, 3);
		System.out.println("After swapping"+str);
		
		ArrayList<String> str3=new ArrayList<String>();
		str3.add("Orange");
		str.addAll(str3);
		System.out.println("Join Two Arraylists"+str);
		
		str.clone();
		System.out.println("After clone"+str);
		
		str3.removeAll(str3);
		System.out.println("Empty string"+str3);
		
		System.out.println("check empty string--"+str.isEmpty());
		System.out.println("check empty string--"+str3.isEmpty());
		
		str.trimToSize();
		System.out.println("After trim--"+str);
		str.add("Green");
		System.out.println(str);
		
		/*ArrayList<String> str4=new ArrayList<String>(2);
		str4.add("abc");
		str4.add("def");
		str4.trimToSize();
		str4.add("ghi");
		System.out.println(str4);
		*/
		str.set(2, "LightGreen");
		System.out.println("replace val to 2nd position"+str);

		System.out.println("get index----");
		int len=str.size();
		for (int i = 0; i < len; i++)
		{
			System.out.println(str.get(i));
		}
		
	}

}
