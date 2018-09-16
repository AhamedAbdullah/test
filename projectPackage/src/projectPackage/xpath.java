package projectPackage;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Ahamed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/facebook.html");
		driver.get("http://www.google.com");
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyRelease(KeyEvent.VK_WINDOWS);
		driver.navigate().back();
		driver = new ChromeDriver();
	//	WebElement element = driver.findElement(By.id("email"));
		Thread.sleep(5000);
		driver.close();
		
	}

}
