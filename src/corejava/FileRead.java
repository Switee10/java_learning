package corejava;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		//using scanner class
		File f=new File("C:\\Users\\Administrator\\Documents\\guvi\\javaGuvi\\src\\corejava\\Input.txt");
		Scanner sc=new Scanner(f);
		System.out.println(sc.nextLine());
	
		//using buffer reader class
		BufferedReader br=new BufferedReader(new FileReader(f));
		String str;
		while( (str=br.readLine()) != null)
		{
			System.out.println(str);
		}
	}

}
