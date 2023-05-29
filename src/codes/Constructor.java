package codes;

public class Constructor
{
	int id;
	String empname;
	
	
	Constructor(int i,String e)
	{
		id=i;
		empname=e;
	}
	public void display()
	{
		System.out.println("Employee id is " + id + "Name is "+empname);
		
	}

	public static void main(String[] args) 
	{
		Constructor c1=new Constructor(1,"Sweety");
		c1.display();
		Constructor c2=new Constructor(2,"Swara");
		c2.display();

		
	}

}
