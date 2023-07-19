package corejava;
import java.util.*;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
		
		Hashtable ht1 = new Hashtable();
				
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(101, "Ram");
		ht.put(102, "Sham");
		//ht.put(103, null);
		ht.put(104, "Sita");
		ht.put(105, "gita");
		System.out.println(ht);
		
		ht.remove(101);
		System.out.println("Remove 101--"+ht);
		
		System.out.println("get value--"+ht.get(104));
		
		System.out.println("contains key--"+ht.containsKey(104));
		System.out.println("contains key--"+ht.containsKey(106));
		
		System.out.println("contains value--"+ht.containsValue(104));
		System.out.println("contains value--"+ht.containsValue(106));

		System.out.println("empty set--"+ht.isEmpty());
		System.out.println("empty set--"+ht1.isEmpty());

		System.out.println("size--"+ht.size());
		System.out.println("get keys--"+ht.keySet());
		System.out.println("get values--"+ht.values());
		System.out.println(ht.entrySet());
		
		//for(datatype variablename:collection)
			
				//	for(table.Entry eachEntry:ht.entrySet())
					//{
						//System.out.println(eachEntry.getKey()+"----"+eachEntry.getValue());
					//}
		
					Set s= ht.entrySet();
					
					Iterator itr= s.iterator();
					
					while(itr.hasNext())
					{
						Map.Entry entry= (Entry) itr.next();
						System.out.println(entry.getKey()+"--"+entry.getValue());
					}
		
		
	}

}
