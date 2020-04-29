package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SATE{
		private WebElement untb;//declaration
		private WebElement pwtb;
		private WebElement LoginBtn;
		private WebElement LogOutBt;
		private WebElement newbtn;
		
		SATE(WebDriver Driver)	{
			untb=Driver.findElement(By.name("username"));//Initialization
			pwtb=Driver.findElement(By.name("pwd"));
			LoginBtn=Driver.findElement(By.id("loginButton"));
			LogOutBt=Driver.findElement(By.id("logoutLink"));
				
		}
		
		public void setUsername(String Username) {
			untb.sendKeys(Username);
		}
		
		public void setPassword(String Password) {
			pwtb.sendKeys(Password);
		}
		
		public void clickLoginBtn() {
			LoginBtn.click();
		}
		public void LogOutBtn() {
			LogOutBt.click();
			
		}
		
	}
	
	
