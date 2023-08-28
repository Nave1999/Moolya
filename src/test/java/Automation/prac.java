package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.common.Assert;
import net.bytebuddy.asm.Advice.Return;

public class prac {
	WebDriver wd;
	@BeforeTest
	public void tt() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
}
	
@Test
public void tr() throws InterruptedException {
	Thread.sleep(3000);
	wd.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
    wd.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
    wd.findElement(By.xpath("//*[@type='submit']")).click();
	
	
	Thread.sleep(3000);

	 wd.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		Thread.sleep(3000);
	 wd.findElement(By.xpath("(//*[@class='oxd-checkbox-wrapper'])[3]")).click();
	  List<WebElement> we = wd.findElements(By.xpath("//*[@class='oxd-table-card']"));
	  System.out.println(we.size());
	  
		Thread.sleep(3000);
      wd.findElement(By.xpath("//*[@class='oxd-table-card']"));
	 
	}
	 
	 
	
	
}


