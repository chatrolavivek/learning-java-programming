package ioprograms;
import java.io.*;
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("file1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String s = "Java is OO programming language";
		bos.write(s.getBytes());//converts String into byte[]
		System.out.println("File Created");
		bos.close();
		fos.close();
	}

}
