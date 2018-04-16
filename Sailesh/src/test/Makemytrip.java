package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")
public class Makemytrip {
	
	WebDriver driver;
	
	public void login() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
		 driver  = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	public void mousehover() throws Throwable{
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.className("o-i-trip-bag"))).build().perform();
	  //Thread.sleep(2000);
	   }
	
	public void dropdown( ){
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[1]/ul[1]/li[4]/div/p[1]/span[1]")).click();
		driver.findElement(By.cssSelector("#ui-id-236")).click();
	
	   // driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[2]/ul[1]/li[5]/div/p[1]/span[1]")).click();
	 //   driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[3]/div/div[1]/table/tbody/tr[5]/td[4]")).click();
	    
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Makemytrip b = new Makemytrip();
		b.login();
		//b.mousehover();
		b.dropdown();

	}

}
