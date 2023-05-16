package assignments;

public class factOfNum {

	public static void main(String[] args) 
	{
		int factnum=8;
		int factres=1;
		int i;
		
		for (i=1;i<=factnum;i++)
		{
			factres=factres*i;
		}
		System.out.println("factorial of 10 is "+factres);
	}

}
