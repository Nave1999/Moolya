package Automation;

import java.awt.AWTException;
import java.awt.Robot;
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

public class practice {
	WebDriver wd;
	Robot r;
	@BeforeTest
	public void tt() {
		
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

}
	@Test
	public void MMT() throws InterruptedException, AWTException {
		wd.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
  	    r = new Robot();
  	    r.keyPress(MenuKeyEvent.VK_F5);
  	    r.keyRelease(MenuKeyEvent.VK_F5);
  	  r.keyPress(MenuKeyEvent.VK_F5);
	    r.keyRelease(MenuKeyEvent.VK_F5);
		Thread.sleep(5000);

	    r.keyPress(MenuKeyEvent.VK_F5);
  	    r.keyRelease(MenuKeyEvent.VK_F5);
  	  r.keyPress(MenuKeyEvent.VK_F5);
	    r.keyRelease(MenuKeyEvent.VK_F5);
  	    Thread.sleep(15000);

	 wd.findElement(By.xpath("//*[@id='fromCity']")).sendKeys("ben");
	

	 Thread.sleep(3000);
	 r.keyPress(MenuKeyEvent.VK_DOWN);
	 r.keyRelease(MenuKeyEvent.VK_DOWN);
	 r.keyPress(MenuKeyEvent.VK_ENTER);
	 r.keyRelease(MenuKeyEvent.VK_ENTER);
	 
	 
	 wd.findElement(By.xpath("//*[@id='toCity']")).sendKeys("Dub");
	 Thread.sleep(3000);
	 r.keyPress(MenuKeyEvent.VK_DOWN);
	 r.keyRelease(MenuKeyEvent.VK_DOWN);
	 r.keyPress(MenuKeyEvent.VK_ENTER);
	 r.keyRelease(MenuKeyEvent.VK_ENTER);
	}
	 
	 
	 @Test
	 public void t3() throws InterruptedException {
	 
	 wd.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[3]"))
	 .click();
	Thread.sleep(3000);

	 wd.findElement(By.xpath("//*[@aria-label='Fri Aug 25 2023']"))
	 .click();
   wd.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']"))
   .click();
     Thread.sleep(3000);
	 }
     
     @Test
     public void t4() throws InterruptedException {
     wd.findElement(By.xpath("//*[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
     Thread.sleep(3000);
     JavascriptExecutor js=(JavascriptExecutor)wd;
     js.executeScript("window.scrollBy(0,400)");


     wd.findElement(By.xpath("//*[@class='appendRight8']")).click();
     
     Thread.sleep(2000);
  
     Thread.sleep(2000);
     wd.findElement(By.xpath("(//*[@class='button corp-btn latoBlack buttonPrimary fontSize13  '])[1]")).click();

     

   
	
     
	}
	

}
