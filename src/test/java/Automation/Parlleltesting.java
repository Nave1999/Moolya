package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parlleltesting {
	WebDriver wd;
	@Parameters("mybrowser")
	@BeforeTest
	public void t1(String mybrowser) {
		
		if(mybrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		     wd=new ChromeDriver();
				wd.get("https://www.moneycontrol.com/personal-finance/tools/emi-calculator.html");

			}
		else if (mybrowser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			wd= new FirefoxDriver();
		}
	}
	@Test
	public void t2() {
		JavascriptExecutor js =(JavascriptExecutor) wd;
		 js.executeScript("document.getElementById('emi_table').scrollIntoView()");
		String str =wd.findElement(By.xpath("//table[@id='emi_table']/tbody/tr[14]/td[5]")).getText();
		System.out.println(str);
	}

}
