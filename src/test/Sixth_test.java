package test;

import org.testng.annotations.*;

public class Sixth_test {

	@Test
	public void web_frtc_lg_hom_01()
	{
	System.out.println("web_frtc_lg_hom_01");
	}
	
	@BeforeTest
	public void before_test_s()
	{
	System.out.println("before_test_s");
	}
	
	@Test(groups= {"sanity"})
	public void web_frtc_lg_hom_02()
	{
	System.out.println("web_frtc_lg_hom_02");
	}
	
	@BeforeSuite
	public void Before_Suite()
	{
	System.out.println("Before_Suite");
	}
	
	@Test
	public void mob_frtc_lg_hom_03()
	{
	System.out.println("mob_frtc_lg_hom_03");
	}
	
	@Test(dependsOnMethods= {"mob_frtc_lg_hom_03"})
	public void tab_frtc_lg_hom_04()
	{
	System.out.println("tab_frtc_lg_hom_04");
	}
	
	@Test(dataProvider="Data_provider_getData")
	public void tab_frtc_lg_hom_05(String username, String password)
	{
	System.out.println("tab_frtc_lg_hom_05" + username);
	System.out.println("tab_frtc_lg_hom_05" + password);
	}
	
	@DataProvider
	public Object[][] Data_provider_getData()
	{
		//1st data set combination of username and password - good cibil hist
		//2nd data set combination of username and password - no cibil hist
		//3rd data set combination of username and password - fraud cibil hist
		// we going to test these combinations with different test data
		// creating multi dimentonal array - 3 rows 2 columns
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "Fuser";
		data[0][1] = "Fpassword";
		//column and rows are values for that particular combination(row)
		//2nd set
		data[1][0] = "Suser";
		data[1][1] = "Spassword";
		//3rd set
		data[2][0] = "Tuser";
		data[2][1] = "Tpassword";
		return data;
		
		
	}
}
