package assignments;

class inheritance1
{
	int rollno=11;
	void Display()
	{
		System.out.println(rollno);
	}
}

public class AchieveInheritance extends inheritance1
{
	void Display1()
	{
		System.out.println(rollno);

		
	}

	public static void main(String[] args)
	{
		AchieveInheritance a=new AchieveInheritance();
		a.Display();
		a.Display1();
		
		

	}

}
