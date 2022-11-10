package Amazon;

public class Story6 {
	
	public void run(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public void display(int x,int y)
	{
		System.out.println(x*y);
	}
}
 class Shape1 extends Story6
{
	void division()
	{
		int x=10;
		int y=5;
		int z=x/y;
		System.out.println(z);
	}
	
}


/*private String name;
private int age;
Story6()
{
	this.name="Rahul";
	this.age=25;
}
Story6(Story6 s)
{
	this.name=s.name;
	this.age=s.age;
}
	public void talk()
	{
		System.out.println(name);
		System.out.println(age);
	}
public static void main(String[] args) {
	Story6 s1=new Story6();
	Story6 s2=new Story6(s1);
	s1.talk();
	s2.talk();
}	
}


    /*int x;
	Story6(int x)
	{
		this.x=x;
	}
	public void input()
	{
		System.out.println(x);
	}
 public static void main(String[] args) {
	Story6 a=new Story6(20);
	a.input();
}	
	
}
	/*for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int j=1;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<5;j++)
		{
			System.out.print("*");
		}
		for(int j=i;j<=5;j++)
		{
			System.out.print("*");
		}
	   System.out.println();
	}
		
		
		
		
	}
	}
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(i);	
			}System.out.println();
		}
	for(int i=5;i>=1;i--)
	{
		for(int j=i;j>=1;j--)
		{
			System.out.print(i);
		}System.out.println();
	}
	}
}
	   /* int x[]= {60,20,30,40};
	     Arrays.sort(x);
	     for( int i=x.length-1;i>=0;i--)
	    System.out.println(x[i]);	  
	
	/*public static void reverse(int[]x)
	{
		int n=x.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;i<=n;j++)
			{
				System.out.println();
			}
			
			/*int y=x[i];
			x[i]=x[n-i-1];
			y=x[n-i-1];*/
			
	
	


