package corejava;
import java.io.File;

public class FileDeletion {

	public static void main(String[] args) 
	{
		File f=new File("C:\\Users\\Administrator\\Documents\\guvi\\javaGuvi\\src\\corejavaInputfile.txt");
		if(f.exists())
		{
			f.delete();
			System.out.println("File got deleted successfully");
		}
		else
		{
			System.out.println("Problem in file deletion");
		}
		
	}

}


