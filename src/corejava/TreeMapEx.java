package corejava;
import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(101, "disha");
		tm.put(102, null);
		tm.put(103, "sejal");
		//tm.put(null, "rina"); //null key are not allowed in tree map
		System.out.println(tm);
		
	}

}
