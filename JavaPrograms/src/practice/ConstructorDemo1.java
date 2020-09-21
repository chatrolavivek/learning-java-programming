package practice;

class Sample
{
	int i;
	int j;
	Sample(int i,int j)//constructor
	{
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println("i="+i+" "+"j="+j);
	}
}
public class ConstructorDemo1 {
	public static void main(String[] args) {
		Sample s = new Sample(10,20);
		s.display();//i=10 j=20

	}

}
