package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver ww = new ChromeDriver();
	ww.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	ww.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
    ww.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
    ww.findElement(By.xpath("//*[@type='submit']")).click();
    
	}

}
