package Amazon;
class Demo extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"thread is running");
	}
}
public class Threadname1 {
public static void main(String[] args) {
	Demo d1=new Demo();
	Demo d2=new Demo();
	d1.setName("Child1");
	d2.setName("child2");
	d1.start();
	d2.start();
	System.out.println(Thread.currentThread().getName()+"thread is running");
}
	
	
}
