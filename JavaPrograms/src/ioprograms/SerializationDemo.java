package ioprograms;
import java.io.*;
class Employee implements Serializable
{
	int eno;
	String ename;
	transient double salary;//not included during serialization
	public Employee(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {}
	public String toString()
	{
		return eno+" "+ename+" "+salary;
	}
}
public class SerializationDemo {
	public static void main(String[] args) throws Exception{
		//Serialization
		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee e = new Employee(111,"Raj",5000.0);
		oos.writeObject(e);
		oos.close();
		fos.close();
		//Deserialization
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1 = (Employee) ois.readObject();
		System.out.println(e1);//invokes toString() implicitly
		ois.close();
		fis.close();
	}

}
