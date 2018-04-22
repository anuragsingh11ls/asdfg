package test.core;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l);
		for (Object object : l) {
			System.out.println(object);
		}

	}

}
