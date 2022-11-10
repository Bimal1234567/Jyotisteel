package Amazon;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Story12 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout=new FileOutputStream("file1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s1="BBSR IS A SMART CITY";
		byte b[]=s1.getBytes();
		bout.write(b);
		bout.close();
		System.out.println("Success...");
	}
}
