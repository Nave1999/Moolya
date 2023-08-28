package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test4 {
	WebDriver wt;
	@BeforeTest
	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    wt = new ChromeDriver();

		Thread.sleep(3000);
		wt.manage().window().maximize();
		//wt.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test
	public void t1() {
		wt.get("https://www.moneycontrol.com/personal-finance/tools/emi-calculator.html");
		String str= wt.findElement(By.xpath("//table[@id='emi_table']/tbody/tr[5]/td[3]")).getText();
		System.out.println(str);
	}
	@Test
	public void t2() {
		wt.get("https://www.moneycontrol.com/personal-finance/");
		WebElement ws= wt.findElement(By.xpath("(//*[@title='Personal Finance'])[2]"));
		Actions act =new Actions(wt);
		act.moveToElement(ws).build().perform();
		wt.findElement(By.xpath("//*[@title='Home Loan Calculator']")).click();
		JavascriptExecutor js =(JavascriptExecutor) wt;
		 js.executeScript("document.getElementById('emi_table').scrollIntoView()");
		String str =wt.findElement(By.xpath("//table[@id='emi_table']/tbody/tr[14]/td[5]")).getText();
		System.out.println(str);
		
	}
	
}
