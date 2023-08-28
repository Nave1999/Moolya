package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
WebDriver wd;
@BeforeTest
	public void tt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 wd= new ChromeDriver();
	 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(3000);
     wd.manage().window().maximize();
	
	}
	@Test(priority = 0)
	public void tt1() {
		wd.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
        wd.findElement(By.xpath("//*[@type='submit']")).click();
	

       }
	
	@Test(priority = 1)
	public void tt2() {
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		wd.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input--before']")).sendKeys("John Smith");

		
		
		
	}
		
		
		
	}
	/*@Test(priority = 1)
	public void t2() throws InterruptedException {
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
		wd.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
		
		
	}
	@AfterTest
	public void t3() {
		wd.close();
	}*/
  

