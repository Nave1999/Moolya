package Automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	WebDriver wd;
	@BeforeTest
	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    wd = new ChromeDriver();

		Thread.sleep(3000);
		wd.manage().window().maximize();

}
	@Test
	public void ts1() {
		wd.get("https://demoqa.com/frames");
		
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("document.getElementById('frame2').scrollIntoView()");
		
		//List<WebElement> frames =wd.findElements(By.tagName("iframe"));
		Set<String> str =(Set<String>) wd.findElement(By.tagName("iframe"));
		System.out.println(str.size());
		
		/*for(int i=0;i<frames.size();i++) {//to get the id's of frames in the page 
			String name =frames.get(i).getAttribute("id");
			System.out.println(name);*/
			
		}
		/*wd.switchTo().frame("frame2");
		js.executeScript("windows.scrollBy(0,100)");//to scroll inside the frame2*/
		
		//wd.switchTo().frame("frame1");
		//wd.findElement(By.id("frame1")).getText();
	}
//}