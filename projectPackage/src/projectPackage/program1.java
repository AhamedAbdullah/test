package projectPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class program1 {
@Test
	public static void test(String[] args)
	{
		
	}
	@BeforeMethod
	public static void test1(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Ahamed\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.close();
		driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.quit();
		driver= new ChromeDriver();
	}

}
