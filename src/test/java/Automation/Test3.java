package Automation;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	WebDriver wt;
		@BeforeTest
		public void bt1() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
		    wt = new ChromeDriver();

			Thread.sleep(3000);
			wt.manage().window().maximize();

		}
		
		
		@Test
		public void test0 (){
			wt.get("https://demoqa.com/text-box");
			wt.findElement(By.xpath("//*[@id='userName']")).sendKeys("xxx");
			wt.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("xxx@gmail.com");
			wt.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("xxx,yyy,zzz");
			wt.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("xxx,yyy,zzz");
			wt.findElement(By.xpath("//*[@id='submit']")).click();
			
			
			
		}
       @Test
       public void test1 () {
			wt.get("https://demoqa.com/checkbox");

    	   wt.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();
    	   wt.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[2]")).click();
    	   wt.findElement(By.xpath("(//*[@class='rct-checkbox'])[3]")).click();
    	  
       }
      @Test
	public void test2 () throws InterruptedException {
			wt.get("https://demoqa.com/radio-button");
			Thread.sleep(3000);
    	  wt.findElement(By.xpath("//*[@class='custom-control-input']")).click();
    	  
      }
      @Test
      public void test3 () throws InterruptedException{
    	  wt.get("https://demoqa.com/webtables");
    	  wt.findElement(By.xpath("//*[@id='edit-record-1']")).click();
    	  wt.findElement(By.xpath("//span[@aria-hidden='true']")).click();
    	  Thread.sleep(3000);
    	  wt.findElement(By.xpath("//*[@id='delete-record-3']")).click();
      }
      @Test
      public void test4 () {
    	  wt.get("https://demoqa.com/buttons");
    	 
    	  WebElement we=wt.findElement(By.xpath("//*[@id='rightClickBtn']"));
    	  Actions act = new Actions(wt);
    	  act.contextClick(we).build().perform();
    	  
    	  WebElement wr =wt.findElement(By.xpath("//*[@id='doubleClickBtn']"));
    	  act.doubleClick(wr).build().perform();
    	  WebElement ww=wt.findElement(By.xpath("//*[@id='ezu3D']"));
    	  act.moveToElement(ww).build().perform();
      }
      @Test
      public void test5 () {
    	  wt.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=9595003453074053944&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-10573980&hydadcr=14453_2154373");
    	  WebElement wd= wt.findElement(By.xpath("//*[@id='nav-link-accountList']"));
    	  Actions act = new Actions(wt);
    	  act.moveToElement(wd).build().perform();
    	 String st = wt.getTitle();
    	 System.out.println(st);
		Assert.assertEquals(st, "DEMOQA");
    	  
      }
      @Test
      public void test6 () {
  		wt.get("https://www.google.co.in/");
//		WebElement we= wt.findElement(By.linkText("Gmail"));
		//WebElement ws= wt.findElement(By.partialLinkText("Gm"));
    	  
      }
      @Test
      public void test7() throws InterruptedException {
    	  wt.get("https://demoqa.com/alerts");
    	  wt.findElement(By.xpath("//*[@id='alertButton']")).click();
    	  Thread.sleep(5000);
    	  Alert alt=wt.switchTo().alert();
    	  alt.accept();
      }
      @Test
      public void test8() throws InterruptedException {
    	  wt.get("https://demoqa.com/alerts");
    	  wt.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
    	  Thread.sleep(6000);
    	  Alert alt=wt.switchTo().alert();//it is used to get access on the popup 
    	  alt.accept();
      }
      @Test
      public void test9() throws InterruptedException {
    	  wt.get("https://demoqa.com/alerts");
    	  wt.findElement(By.xpath("//*[@id='confirmButton']")).click();
    	  Thread.sleep(6000);
    	  Alert alt=wt.switchTo().alert();
    	  alt.dismiss();
    
      
      }
      @Test
      public void test10() throws InterruptedException {
    	  wt.get("https://demoqa.com/alerts");
    	  JavascriptExecutor js =(JavascriptExecutor)wt;
    	  js.executeScript("document.getElementById('promtButton').scrollIntoView()");
    	  
    	  wt.findElement(By.xpath("//*[@id='promtButton']")).click();
    	  Thread.sleep(3000);
    	  Alert alt=wt.switchTo().alert();
    	  alt.sendKeys("abc");//to send the values in the popup msg
    	  alt.accept();
      
      }
      @Test
      public void test11() throws InterruptedException {
    	  wt.get("https://demoqa.com/browser-windows");
    	  String str = wt.getWindowHandle();//to get the particular window id 
    	  System.out.println(str);
    	  JavascriptExecutor js =(JavascriptExecutor)wt;
    	  js.executeScript("document.getElementById('windowButton').scrollIntoView()");
    	  
    	 WebElement we= wt.findElement(By.xpath("//*[@id='windowButton']"));
    	  Thread.sleep(3000);
    	  for (int i=0;i<3;i++) {
    		  
    		we.click() ;
    	  }
    	  Set<String>Allwindows=wt.getWindowHandles();//to get all window ids
    	  System.out.println(Allwindows);
    	  //System.out.println(Allwindows.size());//gives no of windows
          String lastwindow="";//
          for(String handle:Allwindows) {//enchanced loop
        	  wt.switchTo().window(handle);
        	  wt.get("https://www.google.com/");
          }
          wt.switchTo().window(str);
          wt.get("https://demoqa.com/browser-windows");
          wt.close();//to close the parent window
          //wt.switchTo().window();
          wt.switchTo().window(lastwindow);//if close the parent window the amazon page will open in the last window (last opened window),
          //if you not closed the parent window the amazon page will be open in the parent window
          wt.get("https://www.amazon.in/");
          System.out.println(lastwindow);//since the lastwindow is empty it won't print the id's
}

}














