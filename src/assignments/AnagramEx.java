package assignments;

import java.util.Arrays;

public class AnagramEx 
{

	public static void main(String[] args) 
	{
		String str="race";
		String str1="care";
		
		char[] c=str.toLowerCase().toCharArray();
		Arrays.sort(c);
		
		char[] s=str1.toLowerCase().toCharArray();
		Arrays.sort(s);
		
		System.out.println(Arrays.equals(c, s));
	}

}
