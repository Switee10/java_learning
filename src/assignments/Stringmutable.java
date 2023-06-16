package assignments;

public class Stringmutable
{

	public static void main(String[] args)
	{
			//String Immutable
		String str=new String("Hello");
		//str.append("world");
		String str1=str.concat(" World ");
		System.out.println(str1);
		
		
		
		//String Mutable-String builder and string buffer are the mutable versions of a string
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" world");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" world");
		System.out.println(sb1);


	}

}
