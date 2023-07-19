package assignments;
import java.util.*;

public class HashMapCollectionView {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "red");
		hm.put(102, "blue");
		hm.put(103, "grey");
		System.out.println(hm);
		System.out.println(hm.entrySet());

	}

}
