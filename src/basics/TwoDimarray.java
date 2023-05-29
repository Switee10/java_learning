package basics;

public class TwoDimarray {

	public static void main(String[] args)
	{
		int marks[][]=new int[3][3];
		marks[0][0]=1;
		marks[0][1]=2;
		marks[0][2]=3;
		
		marks[1][0]=4;
		marks[1][1]=5;
		marks[1][2]=6;
		
		marks[2][0]=7;
		marks[2][1]=8;
		marks[2][2]=9;

		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks.length;j++)
			{
				System.out.println(marks[i][j]);
			}
		
		}
		
		//2nd way to create two dimentional array
		int marks2[][]= { {11,12,13},{21,22,23},{31,32,33}};
		for(int i=0;i<marks2.length;i++)
		{
			for(int j=0;j<marks2.length;j++)
			{
				System.out.println(marks2[i][j]);
			}
		
		}
		
	}

}
