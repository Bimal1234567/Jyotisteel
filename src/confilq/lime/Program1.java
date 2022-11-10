package confilq.lime;

import org.testng.annotations.Test;

public class Program1 {

	@Test(groups= {"smoke"})
	public void AdmissionLogin()
	{
		System.out.println("Admission login");
	}
	@Test(groups= {"smoke","sanity"})
	public void AdmissionBrokenlinks()
	{
		System.out.println("Admission brokenlinks");
	}
	@Test(groups= {"sanity","regression"})
	public void forignsite()
	{
		System.out.println("solid into colide");
	}
	
}
