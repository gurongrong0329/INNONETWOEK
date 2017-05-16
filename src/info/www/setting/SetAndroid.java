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
		  this.cap.setCapability("automationName","Appium");									//appium���Զ���
		  this.cap.setCapability("deviceName",data.getValue("deviceName"));			//�豸����
		  this.cap.setCapability("platformName",data.getValue("platformName"));		//��׿�Զ�������IOS�Զ���
		  this.cap.setCapability("platformVersion",data.getValue("platformVersion"));//��׿����ϵͳ�汾
		  this.cap.setCapability("appPackage",data.getValue("appPackage"));			//����app�İ���
		  this.cap.setCapability("appActivity",data.getValue("appActivity"));				//����app�����Activity����
		  this.cap.setCapability("appWaitActivity",data.getValue("appWaitActivity"));
		  this.cap.setCapability("unicodeKeyboard","True"); 										//֧����������
		  this.cap.setCapability("resetKeyboard","True"); 											//֧���������룬��������������
		  this.cap.setCapability("noSign","True"); 														//������ǩ��apk
		  this.cap.setCapability("newCommandTimeout","30"); 									//û�������appium30���˳�
		  return this.cap;
	}
}
