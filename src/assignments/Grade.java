package assignments;

public class Grade 
{
	public void checkpassorfail(int studentmarks,String name)
	{
		
		
		if(studentmarks>=35)
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		System.out.println("Student name is :"+name+  " and mark :"+studentmarks);
		
	}		
		
		public void CheckGrade(int studentmarks)
		{
			if (studentmarks >=85)
		{
			System.out.println(" grade A");
		}
		else if(studentmarks >= 70 && studentmarks <85)
		{
			System.out.println(" grade B");
		}
		else if (studentmarks >=50 && studentmarks <70)
		{
			System.out.println(" grade C");
		}
		else if (studentmarks < 50)
		{
			System.out.println(" grade D");
		}
		else
		{
		System.out.println("Stuent has failed and hence grade is not given");
	    }
		}

		public static void main(String[] args)
		{
			Grade s1=new Grade();
			s1.checkpassorfail(85, "sweety");
			s1.CheckGrade(85);
			
			Grade s2=new Grade();
			s2.checkpassorfail(75, "swara");
			s2.CheckGrade(75);
			
			
			
		}
}


	




	
	/*  checkPassOrFail (student name, staudent mark)
	  {
	   if(studentmark >= 40)
	   {
	  		pass
	  }
	  else
	 {
	  	fail
	  }
	  
	  */ 
	   
	   
	 /*  if ( student is pass)
	   
	   {
		   if (mark >==85)
		   {
		   grade a
		   }
		   else if(mark   >= 70 and mark <85)
		   {
		   grade b
		   }
		   else if (mark >=50 and mark <70)
		  {
		   grade c
		   }
		   else if (mark < 50)
		   {
		   grade d
		   }
	   }
	   else
	   {
	   syso("Stuent has failed and hence grade is not given")
	   }
	 
	 

*/
