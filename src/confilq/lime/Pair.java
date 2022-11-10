package confilq.lime;

import java.util.Scanner;

public class Pair {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
	String st2=sc.nextLine();
	String pwd="";
	int i,j;
	for( i=0;i<st1.length();i++)
	{
		for( j=0;j<st2.length();j++)
		{
			pwd=pwd+st1.charAt(i)+st2.charAt(j);
		}
		if(i<st1.length())
			pwd=pwd+st1.substring(i,st1.length());
		if(j<st2.length())
		{
			pwd=pwd+st2.substring(j,st2.length());
			System.out.println(pwd);
		}
			
	}
		
		
		

	}

}
