package Amazon;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Story13 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("file1.java");
		FileOutputStream f1=new FileOutputStream("One.txt");
		FileOutputStream f2=new FileOutputStream("two.txt");
		FileOutputStream f3=new FileOutputStream("three.txt");
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		int i;
		while((i=fi.read())!=-1)
		{
			System.out.println((char)i);
			bout.write((byte)i);
		}
		bout.writeTo(f1);
		bout.writeTo(f2);
		bout.writeTo(f3);
		bout.flush();
		bout.close();
	}

}
