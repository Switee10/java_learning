package corejava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class FileWriting {

	public static void main(String[] args) throws IOException 
	{
		//using filewrite 
		FileWriter fwrite=new FileWriter("C:\\Users\\Administrator\\Documents\\guvi\\javaGuvi\\src\\corejava\\Input.txt");
		String str="im writing data in a file";
		fwrite.write(str);
		fwrite.close();
		System.out.println("data write successfully");
		
		//using bufferedwriter
		BufferedWriter br=new BufferedWriter(new FileWriter("C:\\\\Users\\\\Administrator\\\\Documents\\\\guvi\\\\javaGuvi\\\\src\\\\corejava\\\\Input.txt"));
		String str1="writing data using bufferedwriter ";
		br.write(str1);
		br.close();
		System.out.println("data write successfully using bufferwriter");
	}

}
