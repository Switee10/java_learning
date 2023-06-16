package oops;

interface Car8
{
	void carBrake();
}

interface Car9
{
	void carBrake();
}


public class MulpitpleInheritance2  implements Car8,Car9
{
	
	public void carBrake() 
	{
		System.out.println("Brake applied");
	}
	public static void main(String[] args) 
	{
		MulpitpleInheritance2 mi=new MulpitpleInheritance2();
		mi.carBrake();
	}

	

}
