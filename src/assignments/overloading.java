package assignments;

class Addition
{
	int a,b;
	void add(int a,int b)
	{
		int result;
		result=a+b;
		System.out.println(result);
	}
	void add(int a,int b,int c)
	{
		c=a+b+c;
		System.out.println(c);
	}
}
public class overloading {

	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.add(10, 10);
		a1.add(1, 2, 3);
	}

}
