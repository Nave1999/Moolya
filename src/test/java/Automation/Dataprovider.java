package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	WebDriver wd;
	@DataProvider
	public Object[][] dp(){
		return new Object[][] {
			new Object[] {"san","Admin"},
			new Object[] {"Admin","admin123"},
			
		};
		
	}
	
	
	@BeforeTest
		public void tt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 wd= new ChromeDriver();
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(3000);
	     wd.manage().window().maximize();

}
	@Test //(String n,String s)//////////
	public void tt1() {
		wd.findElement(By.xpath("//*[@name='username']")).sendKeys("");
		wd.findElement(By.xpath("//*[@type='password']")).sendKeys("");
        wd.findElement(By.xpath("//*[@type='submit']")).click();
        
        wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
		wd.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
        
	

}
	
}
