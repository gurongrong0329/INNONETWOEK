package startTest;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import static org.junit.Assert.fail;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import innonetwork.Page.*;
import info.www.setting.*;
import info.www.Assert.*;

public class Login {
	private AndroidDriver driver;
	private DesiredCapabilities cap;
	private int millis=3000;
	
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);    
	  LoginPage lpg=new LoginPage(driver);
	  lpg.Login("account","password");
	  Thread.sleep(millis);
	  Assert ast=new Assert(driver);
	  if(ast.getDeviceLocator()==false)
	  {
		  fail("Login Fail !!!");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {	  
  }

  @AfterMethod
  public void afterMethod() {  
  }

  @BeforeSuite
  public void beforeSuite() throws MalformedURLException {
	  cap=new DesiredCapabilities();	
	  SetAndroid sad=new SetAndroid(cap);
	  cap=sad.settingAndroid();
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }
}
