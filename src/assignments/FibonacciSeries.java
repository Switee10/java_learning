package assignments;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		//Fibonacci series means each number is the sum of the two precceding ones
		//0 & 1 are default values
		//0 1 1 2 3 5 8 13 .....
		
		//first print 0 & 1 default values
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<10;++i)
		{
			int c=a+b+i;
			System.out.println(c);
			
			
			
		}
		
	}

}
