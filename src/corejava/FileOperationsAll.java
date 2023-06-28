package corejava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;

public class FileOperationsAll {

	public static void main(String[] args) throws IOException 
	{
		//creating file
		System.out.println("Enter path of the file");
		Scanner sc=new Scanner(System.in);
		String path =sc.nextLine();
		
		System.out.println("Enter file name");
		Scanner sc1=new Scanner(System.in);
		String fileName =sc1.nextLine();
		
		File f=new File(path+fileName+".txt");
		f.createNewFile();
		System.out.println("file created");
		/*
		//write in a file
		FileWriter fwrite=new FileWriter("C:\\Users\\Administrator\\Documents\\guvi\\javaGuvi\\src\\corejava\\Inputfile.txt");
		String str="Writing data in file operations";
		fwrite.write(str);
		fwrite.close();
		System.out.println("Writing data successfully");
		*/
		//reading file
		File f1=new File("C:\\Users\\Administrator\\Documents\\guvi\\javaGuvi\\src\\corejava\\Inputfile.txt");
		Scanner sc2=new Scanner(f1);
		System.out.println(sc2.nextLine());
		System.out.println("File reading ===");
	}

}
