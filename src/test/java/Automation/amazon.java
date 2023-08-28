package Automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	WebDriver wd;
	
	@BeforeTest
	public void t1() {
		WebDriverManager.chromedriver().setup();
		wd.manage().window().maximize();
		
	}
	@Test
	public void t2() {
		
	}

}
