package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2Test {
	
@Test
	
	public void sample1()
	{
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
	

	driver.get("https://demo.actitime.com/login.do ");
	driver.manage().window().maximize();
}
}