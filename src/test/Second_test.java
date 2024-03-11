package test;
import org.testng.annotations.*;

public class Second_test {
	
	@Parameters({"Testlevel_URL"})
	@Test(groups= {"sanity"})
	public void stc_PL_01(String Testlevel_URL)
	{
	System.out.println("St_TestCase_PL_01" + Testlevel_URL);
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("Before_Test");	
	}
	
	@AfterTest
	public void After_Test_st()
	{
		System.out.println("After_Test");	
	}
	
	@AfterSuite
	public void After_Suite()
	{
	System.out.println("After_Suite");
	}

}
