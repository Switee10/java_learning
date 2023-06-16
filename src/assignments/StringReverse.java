package assignments;

class Reverse
{
	
	void ReverseString(String str)
	{
		int length=str.length();
		for(int i=length-1; i>=0; i--)
		{
			System.out.println(str.charAt(i));
		}
		//System.out.println("string");
	}
}
public class StringReverse {

	public static void main(String[] args) 
	{
		Reverse str1=new Reverse();
		str1.ReverseString("sweety");
		
		str1.ReverseString("Shubham");
		//System.out.println(str1);

	}

}
