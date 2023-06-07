package codes;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"Java", "is ", "my ","favorite","programming","language"};
	
		//sing toString
		String str1= Arrays.toString(str);
		System.out.println(str1);
		
		//join method
		String str2= String.join("-", str);
		System.out.println(str2);
		/*
		 * mary and army
		 * 
		 * convert both the strings to tocharArray() {m,a,r,y} {a,r,m,y}
		 * sort both the char[] using sort method
		 * use equals method to compare two character arrays
		 * 
		 * 
		 */
		
		
		

	}

}
