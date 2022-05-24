import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginPage {
public  WebDriver driver=null;
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "D:\\SetUpSelenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//xet thoi gian cho ngam 20s
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }
  @Test(priority = 0)
  public void loginAccount() {
		
		driver.navigate().to("http://172.16.13.15:81/#/login?returnUrl=%2F");
		
		WebElement email = driver.findElement(By.id("loginEmail"));
		email.sendKeys("huong.tran3");
		
		WebElement password = driver.findElement(By.id("loginPassword"));
		password.sendKeys("123456789");
		
		WebElement buttonSubmitLogin = driver.findElement(By.id("login"));
		buttonSubmitLogin.click();
		
	}

//  @Test(priority = 1)
//  public void searchMID()throws InterruptedException {
//
//		WebElement merchant_gateway = driver.findElement(By.partialLinkText("Merchant"));
//		merchant_gateway.click();
//		Thread.sleep(3000);
//		
//		WebElement textbox_search = driver.findElement(By.xpath("//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
//		textbox_search.sendKeys("TIKI");
//		Thread.sleep(3000);
//		
//		WebElement btnSearch = driver.findElement(By.xpath("//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/button[1]"));
//		btnSearch.click();
//		Thread.sleep(3000);
//  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(3000);
		driver.quit();
  }

}
