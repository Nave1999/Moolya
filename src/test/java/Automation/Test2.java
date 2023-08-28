package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    WebDriver wt= new ChromeDriver();
    wt.get("https://the-internet.herokuapp.com/login");
    
    wt.findElement(By.xpath("//*[@id='username']"/*this is relative xpath*/)).sendKeys("tomsmith");
    
    wt.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
    
    wt.findElement(By.xpath("//*[@type='submit']")).click();
    
    Thread.sleep(3000);
    wt.findElement(By.xpath("//*[@href='/logout']")).click();
	}

}
