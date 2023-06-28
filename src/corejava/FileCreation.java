package corejava;

import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) throws IOException
	{
		//using Scanner class
		System.out.println("Enter the path of a file");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		
		System.out.println("Enter the file name");
		Scanner sc1 = new Scanner(System.in);
		String fileName=sc1.nextLine();
		
		/* using Buffer reader class
		System.out.println("Enter the path of the file ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path1 = br.readLine();
		
		System.out.println("Enter the file name");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String fileName1 = br1.readLine();*/
		
		File f = new File(path+fileName+".txt");
		f.createNewFile();
		
		//File f1 = new File(path+fileName+".txt");
		//f1.createNewFile();
		
	}

}
