package collections;

import java.util.*;

public class GenericCollection {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// al.add(10);//error
		al.add("xxx");
		al.add("yyy");
		al.add("zzz");
		System.out.println(al);// [xxx,yyy,zzz]
		for (String s : al)
			System.out.println(s);
	}

}
