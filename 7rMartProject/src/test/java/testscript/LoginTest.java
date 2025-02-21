package testscript;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation_core.Base;

public class LoginTest extends Base {
	
	 @Test(priority=1,description="User login verification with valid credentials")
	 
	  public void userLoginWithValidCredentails() {
		 WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("admin");
		 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("admin");
		 WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		 loginButton.click();
		 
	 }
	 @Test(priority=2,description="User login invalid username and valid password")
	 
	  public void userLoginWithInvalidUsernameAndValidPassword() {
		 WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("TestUser");
		 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("admin");
		 WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		 loginButton.click();
		 
	 }
	 
	 @Test(priority=3,description="User login valid username and invalid password")
	 
	  public void userLoginWithvalidUsernameAndInvalidPassword() {
		 WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("admin");
		 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("admin1");
		 WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		 loginButton.click();
		 
	 }
	 
	 @Test(priority=4,description="User login invalid username and invalid password")
	 
	  public void userLoginWithInvalidUsernameAndInvalidPassword() {
		 WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("admin1");
		 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		 password.sendKeys("admin1");
		 WebElement loginButton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		 loginButton.click();
		 
	 }

}

