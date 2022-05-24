import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestNG extends LoginPage {

//	@Test(priority = 0)
//	public void testLogin() {
//		loginAccount();
//	}
//
//	@Test(priority = 1)
//	public void testSearchMID() throws InterruptedException {
//		loginAccount();
//		searchMID();
//	}
//
//	@Test(priority = 2)
//	public void testUpdateMaxAmount() throws InterruptedException {
//		loginAccount();
//
//		WebElement merchant_gateway = driver.findElement(By.partialLinkText("Merchant"));
//		merchant_gateway.click();
//		Thread.sleep(3000);
//
//		WebElement textbox_search = driver.findElement(By.xpath(
//				"//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
//		textbox_search.sendKeys("DG072017");
//		Thread.sleep(3000);
//
//		WebElement btnSearch = driver.findElement(By.xpath(
//				"//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/button[1]"));
//		btnSearch.click();
//		Thread.sleep(3000);
//
//		WebElement btnEdit = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
//		btnEdit.click();
//		Thread.sleep(3000);
//
//		WebElement textBox_maxamount = driver.findElement(By.xpath(
//				"//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"));
//		textBox_maxamount.clear();
//		Thread.sleep(4000);
//
//		textBox_maxamount.sendKeys("1000000");
//
//		WebElement btnChange = driver.findElement(By.xpath("//button[contains(text(),'Changes')]"));
//		btnChange.click();
//		Thread.sleep(2000);
//
//		WebElement btnConfirm = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
//		btnConfirm.click();
//		Thread.sleep(2000);
//
//		WebElement btnReload = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[3]/i[1]"));
//		btnReload.click();
//
//		Thread.sleep(3000);
//		boolean checkDisplay = driver.findElement(By.id("toast-container")).isDisplayed();
//
//		if (checkDisplay == true) {
//			System.out.println("Update success");
//		}
//
//	}
//
//	@Test(priority = 3)
//	public void testInactiveMID() throws Exception {
//		loginAccount();
//		searchMID();
//		Thread.sleep(3000);
//		WebElement btnEdit = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
//		btnEdit.click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@id='isActived']")).click();
//		WebElement btnChange = driver.findElement(By.xpath("//button[contains(text(),'Changes')]"));
//		btnChange.click();
//		Thread.sleep(2000);
//
//		WebElement btnConfirm = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
//		btnConfirm.click();
//		Thread.sleep(2000);
//
//		WebElement btnReload = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[3]/i[1]"));
//		btnReload.click();
//
//		// kiem tra checkBox da duoc check hay chua
//		boolean checkBox = driver.findElement(By.id("isActived")).isSelected();
//
//		if (checkBox == false) {
//			System.out.println("Chua duoc chon");
//
//		} else {
//			System.out.println("Da duoc chon");
//		}
//	}
//	
//	@Test(priority = 4)
//	public void updateMinAmount() throws Exception {
//		loginAccount();
//		searchMID();
//		WebElement btnEdit = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
//		btnEdit.click();
//		Thread.sleep(3000);
//
//		WebElement textBox_minamount = driver.findElement(By.xpath(
//				"//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]"));
//		textBox_minamount.clear();
//		Thread.sleep(4000);
//
//		textBox_minamount.sendKeys("100");
//		WebElement btnChange = driver.findElement(By.xpath("//button[contains(text(),'Changes')]"));
//		btnChange.click();
//		Thread.sleep(2000);
//
//		WebElement btnConfirm = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
//		btnConfirm.click();
//		Thread.sleep(2000);
//
//		WebElement btnReload = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[3]/i[1]"));
//		btnReload.click();
//		
//	}
	@Test(priority = 5)
	public void updateConfig_paybytoken()throws Exception {
		loginAccount();
		WebElement merchant_gateway = driver.findElement(By.partialLinkText("Merchant"));
		merchant_gateway.click();
		Thread.sleep(3000);
		
		WebElement textbox_search = driver.findElement(By.xpath("//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		textbox_search.sendKeys("PCODE_pE20171207");
		Thread.sleep(3000);
		
		WebElement btnSearch = driver.findElement(By.xpath("//body/app-dashboard[1]/div[1]/main[1]/div[1]/app-merchants[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/button[1]"));
		btnSearch.click();
		Thread.sleep(3000);
		WebElement btnEdit = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
		btnEdit.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='isPayWithToken']")).click();
		
		WebElement btnChange = driver.findElement(By.xpath("//button[contains(text(),'Changes')]"));
		btnChange.click();
		Thread.sleep(2000);

		WebElement btnConfirm = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		btnConfirm.click();
		Thread.sleep(2000);

		WebElement btnReload = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[3]/i[1]"));
		btnReload.click();
		boolean config_payBytoken = driver.findElement(By.xpath("//input[@id='isPayWithToken']")).isSelected();
		
		
		if(config_payBytoken==false) {
			System.out.println("chua bat config");
			
		}else {
			System.out.println("da bat config");
		}
		
	}
	

}
