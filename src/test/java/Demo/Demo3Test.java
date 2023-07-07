package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3Test {
WebDriver driver=null;
@Test
	
	public void D1test() {
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		//WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox"))
	{
		//WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		//WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}
	else
	{
		driver = new ChromeDriver();
	}
	driver.get(URL);
System.out.println("----- browser launched -----");
	
}
}
