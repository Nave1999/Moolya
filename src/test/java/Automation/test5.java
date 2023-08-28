package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {

	WebDriver wt;
		@BeforeTest
		public void bt1() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
		    wt = new ChromeDriver();

			Thread.sleep(3000);
			wt.manage().window().maximize();

}
		@Test
		public void test0 (){//for download and upload
			wt.get("https://demoqa.com/upload-download");
			wt.findElement(By.xpath("//*[@id='downloadButton']")).click();
			wt.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("C:\\Users\\INDIAN\\Downloads\\sampleFile (1).jpeg");
}
		
		@Test
		public void test1 (){//drag and drop
			wt.get("https://demoqa.com/droppable");
			WebElement we=wt.findElement(By.xpath("//*[@id='draggable']"));
			WebElement ws=wt.findElement(By.xpath("//*[@id='droppable']"));
			Actions act= new Actions(wt);
			act.dragAndDrop(we, ws).build().perform();
		}

}