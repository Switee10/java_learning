package oops;

//this can be used to invoke current class method (implicitly)

class This
{
	void method1()
	{
		System.out.println("this is first method");
	}
	void method2()
	{
		method1();
		//this.method1();
		System.out.println("this is second method");
	}
	
}

public class ThisMethod {

	public static void main(String[] args) 
	{
		This obj=new This();
		//obj.method1();
		obj.method2();

	}

}
/*
 * package oops;

class Bike2
{
	void brake()
	{
		System.out.println("Brake applied successfully");
	}
	
	void accelerate()
	{
		//this.brake();
		brake();
		System.out.println("Acceleration is good in this bike");
	}
}

public class ThisCurrentClassMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike2 obj = new Bike2();
		obj.accelerate();
		//obj.brake();

	}

}
 */
