package assignments;

class Datahide
{
	private int Rollno;
	
		//getter and setter methods
	public void setRollno(int rollno) 
	{
		Rollno = rollno;
	}
	public int getRollno() 
	{
		return Rollno;
	}

	
	
}
public class HidingDataEx {

	public static void main(String[] args) 
	{
		Datahide d=new Datahide();
		d.setRollno(20);
		System.out.println("Rollno.is="+d.getRollno());

	}

}
