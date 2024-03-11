package test;
import org.testng.annotations.*;

public class First_test {
	
	@Parameters({"URL","APIKey"})
	@Test
	public void ftc_PL_01(String URL, String APIKey)
	{
	System.out.println("ft_PL_TestCase01" + URL);
	System.out.println("ft_PL_TestCase01" + APIKey);
	}
	
	@Test(groups= {"sanity"})
	public void ftc_PL_02()
	{
	System.out.println("ft_PL_TestCase02");
	}
	
	@AfterMethod
	public void After_Method_tt()
	{
	System.out.println("After_Method_tt");
	}
	
	@BeforeClass
	public void Before_class_tt()
	{
	System.out.println("Before_class_tt");
	}
}
