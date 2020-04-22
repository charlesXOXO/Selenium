package E2ETestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("charles");
		a.add("Chacko");
		a.add(1, "The");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.indexOf("charles"));
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		HashMap<String,String> hms = new HashMap<String,String>();
		hms.put("1", "Kanika");
		hm.put(0, "Charles");
		hm.put(1, "Chacko");
		hm.put(2, "The");
		System.out.println(hm.get(1));
		Set sn = hm.entrySet();
		Iterator is = sn.iterator();
		
		while(is.hasNext()) {
			Map.Entry mp = (Map.Entry)is.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	
	}
}
