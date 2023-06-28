package basics;

public class Array {

	public static void main(String[] args)
	{
		//int marks=10;
		//first way
		float marks1[]=new float [5];
		marks1[0]=1.1f;
		marks1[1]=2.2f;
		marks1[2]=3.3f;
		marks1[3]=4.4f;
		
/*
		System.out.println(marks1[4]);
		
		//second way 
				char marks2[]= {'a','b','c','d'};
				for(int j=0;j<marks2.length;j++)
				{
					System.out.println(marks2[j]);
				}

				//third way
			//	int[] marks3 = {23,67,89};
	*/			
				System.out.println("Size of marks1 array is "+marks1.length);
				
				
				for (int i=0; i<marks1.length;i++)
				{
					System.out.println(marks1[i]);
				}
				

	}

}
