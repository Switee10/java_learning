package codes;

class modifier
{
	int num=20;
	void display()
	{
		System.out.println("number is "+num);
	}
}


public class DefaultModifier {

	public static void main(String[] args)
	{
		modifier f=new modifier();
		System.out.println(f.num);
		f.display();
				

	}

}
