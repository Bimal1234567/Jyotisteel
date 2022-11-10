package Amazon;

class Test extends Thread
{
	@Override
	public void run()
	{
		System.out.println("child thread is running");
	}
}

public class Story21 {

	public static void main(String[] args) {
		System.out.println("main thread is running....");
		Test t1=new Test();
		t1.start();
		System.out.println("main Thread ended");
	}

}
