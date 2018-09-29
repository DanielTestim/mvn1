package danielsGroup.mydemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void t() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://yoniflenner.net/Xamples/pizza");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
  }
  
  @Test
  public void g() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
  }
}