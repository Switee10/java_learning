package assignments;

public class CharOccurence {

	public static void main(String[] args)
	{
		String str="sweety";
		char ch='e';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				 count++;
			}
		}
		System.out.println("the character has repeated "+count + " times");
	}

}
