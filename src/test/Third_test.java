package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Third_test {

	@Test
	public void ttc_lg_car_01()
	{
	System.out.println("tt_TestCase_car_01");
	}
	
	@Test(groups= {"sanity"})
	public void ttc_lg_car_02()
	{
	System.out.println("tt_TestCase_car_02");
	}
	
	@Test(groups= {"sanity"})
	public void ttc_lg_car_03()
	{
	System.out.println("tt_TestCase_car_03");
	}
	
	@BeforeMethod
	public void Before_Method_tt()
	{
	System.out.println("Before_Method_tt");
	}
	
}
