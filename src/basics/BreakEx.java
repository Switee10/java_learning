package basics;

//Break statement is used terminate the loop, if a specific condition is met. This would be primarily along with all the looping structures
//It is used to exit the control of program. It will break the immediate loop of the program

public class BreakEx {

	public static void main(String[] args) {
		
		for (int i=1; i<=10;i++)
		{
			if(i==5)
			{
				break;				
			}
			
			System.out.println(i);
			//1
			//2
			//3
			//4
			
		}
		

	}

}
