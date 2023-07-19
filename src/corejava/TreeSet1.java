package corejava;
import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();//maitains data in ascending order
		ts.add("pink");
		ts.add("Black");
		ts.add("Yelow");
		ts.add("Red");
		ts.add("White");
		 
		System.out.println("TreeSet--"+ts);
		
		for(Object data:ts)
		{
			System.out.println(data);
		}
	
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.addAll(ts);
		System.out.println("Elements in another treeset--"+ts1);
		
		NavigableSet<String>
        treereverse=ts.descendingSet();
		System.out.println("Reverse Order--"+treereverse);
		
		System.out.println("First Element--"+ts.first());
		System.out.println("Last element--"+ts.last());
		
		TreeSet cloned_set = new TreeSet();//create new clone set
		cloned_set = (TreeSet)ts.clone();
		System.out.println("clone into set--"+cloned_set);
		
		System.out.println("no of elements--"+ts.size());
		
		
		System.out.println("Removed first element--"+ts.pollFirst());
		System.out.println(ts);
		
		System.out.println("Remove Last--"+ts.pollLast());
		System.out.println(ts);
		
		ts.remove("Red");
		System.out.println("Remove given element--"+ts);

	}

}
