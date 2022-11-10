package Amazon;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Story18 {
 
	String name;
	int id;
	double fees;
	Story18()
	{
		
	}
	Story18(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	Story18(String name,int id,double fees)
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(fees);
	}
	public void get()
	{
		System.out.println(this.name);
		System.out.println(this.id);
	}
	public static void main(String[] args)  {
		
		Story18 s1=new Story18("Biswa",18);
		s1.get();
		
		
		
		/*FileOutputStream fout=new FileOutputStream("File5.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s1="smart city";
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();	 
		String s2= sb.toString();
		byte[]i=s2.getBytes();
	    bout.write(i);
	    bout.close();*/
	}

}
