package assignments;

public class RemoveCharacter {

	public static void main(String[] args) 
	{
		StringBuilder character = new StringBuilder("Hello world");
		character.deleteCharAt(2);
		System.out.println(character);
		//character.
		
		String ch="this is my java program";
		
		int count=0;
		for(String word:ch.split(" "))
		{
			count++;
		}
		System.out.println(count);
	}
  
}
