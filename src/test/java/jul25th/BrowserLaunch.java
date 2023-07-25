package jul25th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	WebDriver driver;
	@Test
	public void browserLaunch() throws IOException, InterruptedException
	{
		
		FileInputStream fis=new FileInputStream("config.properties");
		
		Properties pr=new Properties();
		
		pr.load(fis);
		
		String browserName=pr.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		}
		
		
		//launch app 
		
		driver.get(pr.getProperty("url"));
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
