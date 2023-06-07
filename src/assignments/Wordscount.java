package assignments;

public class Wordscount {

	public static void main(String[] args)
	{
		
		
		int count1=1;
		String str="This is java programming";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				
				count1++;
				
			}
		}
		System.out.println(count1);
		
	}

}
//String ch="this is my java program";

		//int count=0;
		//for(String word :ch.split(" "))
		//{
			//count++;
		//} 
		//System.out.println(count);