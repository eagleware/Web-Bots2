package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATE {
	static {
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium JAR\\\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		Thread.sleep(15000);
		SATE li=new SATE(driver);
		Thread.sleep(2000);
		li.setUsername("admin");
		Thread.sleep(2000);
		//li.setPassword("manager");
		Thread.sleep(2000);
		li.clickLoginBtn();
		Thread.sleep(2000);
		li.LogOutBtn();
		Thread.sleep(4000);
		
		
	}

}
