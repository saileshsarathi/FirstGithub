package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class Priority {
	
	WebDriver driver;
	@Test(priority='0')
	public void test() throws Throwable {
		 
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfeVJaBNCTyiqOYxOC9sdx4uw9brivYOrc8S119_uPtFl_1FiQq_eqNPfslWCGxn2isz3kjGFb2OUlTqDewRvEFGRqQ514GKzyUrX8ApKi8MbQ&smuh=42896&lh=Ac-cFl3RPq4dyL3L");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test (priority='1')
	public void test1(){
		driver.get("https://www.facebook.com/?");	
	driver.findElement(By.id("email")).sendKeys("sailesh.karthick@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("643364");
	driver.findElement(By.id("u_0_2")).click();
		
	}


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test executed");
	  
  }

 

}
