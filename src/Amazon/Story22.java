package Amazon;

class Foo extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread is running");
	}
}
public class Story22 {
public static void main(String[] args) {
	System.out.println("Main Thread is started");
	Foo f1=new Foo();
	System.out.println(f1.isAlive());
	f1.start();
	System.out.println(f1.isAlive());
	System.out.println("main method is ended");
}
}
