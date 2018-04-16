package facebook.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng1 extends Testng  {

WebDriver driver;
@Parameters("browsers")
@Test


  public void f(String str) {
	if(str.equalsIgnoreCase("chrome"))
	{
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	}
	else if (str.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Library\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.ca/");
		driver.close();
	}
  }

@Test

public void sai1(){
	System.out.println("Hello");
	System.out.println(a);
} 
}
