package Automation;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Absolutexpath {
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
	@Test
	public void t1() {
		wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");//absolute xpath using tag names to find the path
	}
}