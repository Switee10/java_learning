package assignments;

public class SwapTwoStrings {

	public static void main(String[] args) 
	{
		String str1="java";
		String str2="Language";
		
		System.out.println("Before swapping str1 - "+ str1 +" str2 - "+str2);
		
		//for swapping we use third variable
		String str3=str1;
		str1=str2;
		str2=str3;
		
		System.out.println("After swapping str1 -"+str1);
		System.out.println("After Swapping str2 -"+str2);
		
		
	}

}
