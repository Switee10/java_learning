package basics;

public class StringBufferEx {

	public static void main(String[] args)
	{
		
		StringBuffer sbb= new StringBuffer();
		System.out.println("default Capacity-->"+sbb.capacity());
		
		sbb.append("Hello");
		System.out.println("After inserting hello-->"+sbb);
		
				//second way of creating stringbuffer
				StringBuffer sbb1 = new StringBuffer("Hello");
				sbb1.append("world");
				System.out.println("Second way of creating stringbuilder-->"+sbb1);
				
				//Third way of creating Stringbuilder
				StringBuffer sbb2= new StringBuffer(20);
				sbb2.append("java");
				sbb2.append("language");
				System.out.println("Third way of ceating StringBuilder-->"+sbb2);
				
				sbb2.insert(0, "this is");
				System.out.println("After inserting this is-->"+sbb2);
				
				sbb2.delete(0,7);
				System.out.println("After deleting this is-->"+sbb2);
				
				sbb2.replace(0, 0, "this is");
				System.out.println("After replacing this is-->"+sbb2);


				String sub=sbb.substring(0,5);
				System.out.println("Extracting Hello from sb-->"+sub);
				System.out.println("Extracting Hello from sb-->"+sbb.substring(0,5));
				
				
				
				
	}

}
