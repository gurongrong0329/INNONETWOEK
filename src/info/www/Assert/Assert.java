package info.www.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Assert {
	protected AndroidDriver driver;	
		
	public Assert(AndroidDriver driver){
		this.driver=driver;
	}
	
	public WebElement getLocatorFiled(By elementLocator)
	{
		return this.driver.findElement(elementLocator);
	}
	
	public boolean getDeviceLocator()
	{
		try{
			getLocatorFiled(By.id("com.inno:id/rb_device"));
			return true;
		}catch(NoSuchElementException e)
		{
			e.getMessage();
			return false;
		}
	}
}
