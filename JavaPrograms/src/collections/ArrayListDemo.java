package collections;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
//		LinkedList al = new LinkedList();	// It's the same
		al.add(10);// Autoboxing - added in Java 5 version
		al.add(20);
		al.add("xxx");
		al.add("yyy");
		System.out.println(al);// [10,20,xxx,yyy]
		al.add(2, "ppp");
		System.out.println(al);// [10,20,ppp,xxx,yyy]
		al.set(2, "qqq");
		System.out.println(al);// [10,20,qqq,xxx,yyy]
		al.remove("qqq");
		System.out.println(al);// [10,20,xxx,yyy]
		al.remove(2);
		System.out.println(al);// [10,20,yyy]
		String s = (String) al.get(2);
		System.out.println(s);// yyy
		System.out.println("Size = " + al.size());// Size = 3
	}

}
