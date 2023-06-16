package oops;

interface RBI
{
	void RateofInterest();
}

class SBI implements RBI
{
	public void RateofInterest() 
	{
	System.out.println("Interest rate is 11");	
	}
	
}
class IDFC implements RBI
{
	public void RateofInterest() 
	{
	System.out.println("Interest rate is 12");
	}
	
}
class Axis4 implements RBI
{
	public void RateofInterest() 
	{
	System.out.println("Interest rate is 13");
	}	
}

public class InterfaceEx2 {

	public static void main(String[] args)
	{
		SBI b=new SBI();
		b.RateofInterest();
		
		IDFC b1=new IDFC();
		b1.RateofInterest();
		
		Axis4 b2=new Axis4();
		b2.RateofInterest();

	}

}
