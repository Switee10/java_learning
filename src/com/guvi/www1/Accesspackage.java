package com.guvi.www1;

import com.guvi.www.AA;		//for accessing only AA class from package

//if we are going to access all classes from that package then declare as a
import com.guvi.www.*;
import com.guvi.www.subpack.*;

public class Accesspackage {

	public static void main(String[] args) 
	{
		AA obj=new AA();
		obj.msg();
		
		BB obj1=new BB();
		obj1.msg1();
		
		//using a fully qualified name instead of importing the package
				com.guvi.www.AA obj3 = new com.guvi.www.AA();
				obj3.msg();
				
				//Accessing the subpackage
				SubpackEx obj4 = new SubpackEx();
				obj4.message3();
	}

}
