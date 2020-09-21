package practice;

class ParentClass {
	public void m1(ParentClass a1) {
		System.out.println("aaaa");
	}
}

class ChildClass extends ParentClass {
	public void m1(ChildClass b1) {
		System.out.println("bbbbbb");
	}
}

class SubChildClass extends ChildClass {
	// public void m1() {
	// System.out.println("CCC");
	// }
}

public class PolymorphismDemo {

	public static void main(String[] args) {

		// C c = new C();
		// A a = (A)c; // A a = new C();
		// c.m1(); // ccc
		// ((B) c).m1();//ccc
		// ((A) ((B) c)).m1();//ccc
		// ((A) c).m1();
		ChildClass b = new ChildClass();
		ParentClass a = new ChildClass();
		a.m1(b);

	}

}
