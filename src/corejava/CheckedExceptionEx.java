package corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionEx {

	public static void main(String[] args)  
	{

		//Using throws keyword
			try 
			{
				CheckedEx.checkedExceptions();
			}
			catch (FileNotFoundException e)
			{
				
				System.out.println("Inside Filenot found exception");
				e.printStackTrace();
			}
			catch (InterruptedException e)
			{
				System.out.println("Inside Interrupted exception");
				e.printStackTrace();
			}
		

			//Using try/catch block
			CheckedEx1.checkedExceptions();
			
	}

}


class CheckedEx
{

	static void checkedExceptions() throws InterruptedException, FileNotFoundException 
	{
//Interrupted exception
		Thread.sleep(5);

		//FileNotFoundException
		File f= new File("C:\\Users\\Guest User\\guvilearning\\Javaguv\\src\\basic\\exceptions.txt");
		FileReader fr= new FileReader(f); 
	}
}

class CheckedEx1
{

	static void checkedExceptions() 
	{
//Interrupted exception
		try
		{
			Thread.sleep(5);
		}
		catch (InterruptedException e) {

			e.printStackTrace();
		}

		//FileNotFoundException
		File f= new File("C:\\Users\\guvilearning\\Javaguv\\src\\basic\\exceptions.txt");
		try
		{
			FileReader fr= new FileReader(f);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		
	}
}

