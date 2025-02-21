package automation_core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser()
	{
	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		
	}
	
	
	
	@AfterMethod
	public void driverCloseAndQuit()
	{
		
	//driver.quit();//to close all window in current session
	}
}
