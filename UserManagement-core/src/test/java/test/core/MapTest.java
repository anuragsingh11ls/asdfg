package test.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(1, "anurag");
		m.put(1, "anur");
		Set s=m.entrySet();
		for (Object object : s) {
			System.out.println(object);
		}System.out.println("11111111"+m.get(1).hashCode());
		System.out.println("22222222222"+m.get(2).hashCode());
		//System.out.println(m.hashCode());
	}

}
