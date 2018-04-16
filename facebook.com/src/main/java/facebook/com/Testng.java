package facebook.com;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testng extends  abstractclass{
	WebDriver driver;
	int a =20;
  @Test
  public void f( ) {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Library\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	int x= 10;
	int y = 10;
	
	AssertJUnit.assertEquals(x, y);
	
	sai(10);
	
  }
public void sai() {
	// TODO Auto-generated method stub
	
}
public void sai(int z) {
	// TODO Auto-generated method stub
	z=10;
	System.out.println(z);
}
}
