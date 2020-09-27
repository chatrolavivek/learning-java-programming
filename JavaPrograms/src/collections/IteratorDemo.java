package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Vivek");
		ll.add('N');
		ll.add("Chatrola");
		ll.add("Roll no");
		ll.add(40059267);
		ll.add(true);
		System.out.println(ll);

//		for(int i = 0; i<ll.size(); i++) {
//			System.out.println(ll.get(i));
//		}

		Iterator iter = ll.iterator();
		while (iter.hasNext()) {
			iter.next();
		}

	}

}
