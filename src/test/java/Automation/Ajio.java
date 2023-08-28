package Automation;

import java.awt.Robot;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	WebDriver wd;
	Robot rt;
	Actions act;
	@BeforeTest
	public void test1 () throws InterruptedException{
		Map<String, Object>prefs =new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		options.setExperimentalOption("prefs",prefs);
wd=new ChromeDriver();
		 wd.get("https://www.ajio.com/");
		 Thread.sleep(3000);
		 //wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
wd.manage().window().maximize();
		
	}
	@Test (priority = 0)
public void AJ1() throws InterruptedException {
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		act= new Actions(wd);
		WebElement we= wd.findElement(By.xpath("(//*[@class=' alignTag'])[1]"));//mouse hover on Men
		act.moveToElement(we).build().perform();
		WebElement we1= wd.findElement(By.xpath("(//*[@class='catg inactive-text'])[1]"));//mouse hover on CATEGORIES
		act.moveToElement(we1).build().perform();
		wd.findElement(By.xpath("(//*[@class='third-level'])[3]/div/a")).click();

}
	@Test(priority = 1)
	public void aj2() throws InterruptedException {
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//*[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click(); // Gender filter men checkbox
	    wd.findElement(By.xpath("(//*[@class='rilrtl-list '])[3]/li/div/div")).click();// men watches checkbox
	// wd.findElement(By.xpath("//*[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Watches']")).click();// men watches checkbox

	 wd.findElement(By.xpath("(//*[@class='imgHolder'])[2]")).click(); // select any item
	
	}
	
	/*@Test(priority = 2)
	public void SelectedItem() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(wd, 10);
		
	 WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='pdp-wishlist-desktop-icon']")));
	
			we.click();

		
		Thread.sleep(5000);
		wd.findElement(By.xpath("(//*[@class='slick-arrow slick-next'])[2]")).click();
	}*/
	}
