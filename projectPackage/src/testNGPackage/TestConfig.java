package testNGPackage;


import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//show the use of @BeforeSuite and @BeforeTest
public class TestConfig {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("testBeforeSuite()");
	}

	@AfterSuite
	public void testAfterSuite() {
		System.out.println("testAfterSuite()");
	}
	@BeforeGroups
	public void testBeforeGroup() {
		System.out.println("testBeforeGroup()");
	}
@AfterGroups
public void testAfterGroups() {
		System.out.println("testAfterGroups()");
	}
	
	
	
	@BeforeTest
	public void testBeforeTest() {
		System.out.println("testBeforeTest()");
	}

	@AfterTest
	public void testAfterTest() {
		System.out.println("testAfterTest()");
	}

}