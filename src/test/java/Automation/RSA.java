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
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RSA {
WebDriver ww;
Robot r;
	@BeforeTest
	public void T1 () {
		WebDriverManager.chromedriver().setup();
		 ww= new ChromeDriver();
		//ww.get("https://rahulshettyacademy.com/AutomationPractice/");
		ww.manage().window().maximize();
	}
	
	@Test
	public void t2 () {
		ww.findElement(By.xpath("(//*[@class='btn btn-primary'])[1]")).click();
	}
	@Test
	public void t3() throws InterruptedException {

		//ww.findElement(By.xpath("(//*[@name='radioButton'])[1]")).click();
		//ww.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		ww.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("India");
		
		ww.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper'])[2]")).click();
		//ww.findElement(By.xpath("//*[@id='dropdown-class-example']")).click();
	//	ww.findElement(By.xpath("//*[@value='option1']")).click();
		
	}
	@Test
	public void t4() {
		ww.findElement(By.xpath("//*[@id='opentab']")).click();
		r.keyPress(MenuKeyEvent.VK_CONTROL);
		r.keyPress(MenuKeyEvent.VK_TAB);
		r.keyRelease(MenuKeyEvent.VK_TAB);
		r.keyRelease(MenuKeyEvent.VK_CONTROL);
		
	}
	@Test
	public void t5() throws AWTException {
		ww.get("https://www.google.co.in/");
		WebElement ws= ww.findElement(By.xpath("(//*[@class='gb_y'])[1]"));
		Actions act = new Actions(ww);
		act.contextClick(ws).build().perform();
		 r =new Robot();
		r.keyPress(MenuKeyEvent.VK_DOWN);
		r.keyRelease(MenuKeyEvent.VK_DOWN);
		r.keyPress(MenuKeyEvent.VK_DOWN);
	    r.keyRelease(MenuKeyEvent.VK_DOWN);
		r.keyPress(MenuKeyEvent.VK_ENTER);
		//r.keyRelease(MenuKeyEvent.VK_ENTER);
		
	}
}
