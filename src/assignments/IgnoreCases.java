package assignments;

public class IgnoreCases {

	public static void main(String[] args)
	{
								//ignorecases
		String str="java programming";
		String str1="my class";
		String str2="MY class";
		
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equals(str2));
		
							//string to integer
		String str3="11";
		int num=Integer.parseInt(str3);
		System.out.println(num);
		
		
								//reverse string
		String str4="java";
		int length=str4.length();
		for(int i=length-1; i>=0; i--)
		{
			System.out.println(str4.charAt(i));
		}
		
		
	}

}
