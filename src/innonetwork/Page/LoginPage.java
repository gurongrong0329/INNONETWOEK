package innonetwork.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import info.www.parseproperties.*;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	protected AndroidDriver driver;
	private By accountLocator;
	private By passwordLocator;
	private By loginButtonLocator;
	private ParseProperties data;
	
	public LoginPage(AndroidDriver driver)
	{
		this.driver=driver;
		data=new ParseProperties(System.getProperty("user.dir")+"\\tool\\define.properties");
		
		accountLocator=By.id(data.getValue("accountLocator"));
		passwordLocator=By.id(data.getValue("passwordLocator"));
		loginButtonLocator=By.id(data.getValue("loginButtonLocator"));
	}
	
	public WebElement getLocatorFiled(By elementLocator)
	{
		return this.driver.findElement(elementLocator);
	}
	
	public void Login(String account,String password){
		getLocatorFiled(accountLocator).sendKeys(data.getValue(account));
		getLocatorFiled(passwordLocator).sendKeys(data.getValue(password));
		getLocatorFiled(loginButtonLocator).click();
	}
}
