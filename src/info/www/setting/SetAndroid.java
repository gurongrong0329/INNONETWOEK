package info.www.setting;

import org.openqa.selenium.remote.DesiredCapabilities;
import info.www.parseproperties.*;

public class SetAndroid {
	protected DesiredCapabilities cap;	
	private ParseProperties data;
	
	public SetAndroid(DesiredCapabilities cap){
		  this.cap=cap;	
		  data=new ParseProperties(System.getProperty("user.dir")+"\\tool\\define.properties");
	}
	
	public DesiredCapabilities settingAndroid(){
		  this.cap.setCapability("automationName","Appium");									//appium做自动化
		  this.cap.setCapability("deviceName",data.getValue("deviceName"));			//设备名称
		  this.cap.setCapability("platformName",data.getValue("platformName"));		//安卓自动化还是IOS自动化
		  this.cap.setCapability("platformVersion",data.getValue("platformVersion"));//安卓操作系统版本
		  this.cap.setCapability("appPackage",data.getValue("appPackage"));			//被测app的包名
		  this.cap.setCapability("appActivity",data.getValue("appActivity"));				//被测app的入口Activity名称
		  this.cap.setCapability("appWaitActivity",data.getValue("appWaitActivity"));
		  this.cap.setCapability("unicodeKeyboard","True"); 										//支持中文输入
		  this.cap.setCapability("resetKeyboard","True"); 											//支持中文输入，必须两条都配置
		  this.cap.setCapability("noSign","True"); 														//不重新签名apk
		  this.cap.setCapability("newCommandTimeout","30"); 									//没有新命令，appium30秒退出
		  return this.cap;
	}
}
