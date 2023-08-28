package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	WebDriver wd;
	Robot r;
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
	public void tt2() throws AWTException, InterruptedException {
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		wd.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		wd.findElement(By.xpath("//*[@placeholder='Type for hints...']")).sendKeys("John Smith");
		r= new Robot();
         r.keyPress(MenuKeyEvent.VK_DOWN);
        // r.keyRelease(MenuKeyEvent.VK_DOWN);
         r.keyPress(MenuKeyEvent.VK_ENTER);
 		//r.keyRelease(MenuKeyEvent.VK_ENTER);
         
		wd.findElement(By.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		r= new Robot();
		r.keyPress(MenuKeyEvent.VK_DOWN);
		//r.keyRelease(MenuKeyEvent.VK_DOWN);
		r.keyPress(MenuKeyEvent.VK_ENTER);
		r.keyRelease(MenuKeyEvent.VK_ENTER);
		wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("(//*[@class='oxd-main-menu-item'])[7]")).click();

}
	/*@Test(priority = 2)
	public void t2() throws InterruptedException {
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
		wd.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
	
}
	@AfterTest
	public void t3() throws InterruptedException {
		
		Thread.sleep(4000);
	wd.close();
	}*/

}