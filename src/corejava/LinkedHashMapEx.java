package corejava;
import java.util.*;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap lhm1 = new LinkedHashMap();
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(101, "Hari");
		lhm.put(102, "om");
		lhm.put(103, "ansh");
		lhm.put(null, "zen");
		lhm.put(104, null);
		
		System.out.println(lhm);

		lhm.remove(101);
		System.out.println(lhm);
		
		
	}

}
