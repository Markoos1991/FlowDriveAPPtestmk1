//Note for this script I planed to break it up in to a series of smaller tests making it a bit simpler.
//but if this is the script youre getting that dint happen for whatever reason.
package Test_Flow_V1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
/*Guess work as to what to put here 16/10/2017*/
public class Flow_TabsRun {
	protected static AndroidDriver<AndroidElement> driver;
	
//Before --- Capabilities???//
@Before
public void setup() throws InterruptedException, MalformedURLException 
{
	
	File AppPackage = new File(AppPackage, "FlowDrive.apk");
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability ("DeviceName", "PhoneName");
	capabilities.setCapability ("PlatformName", "Platform");
	capabilities.setCapability("PlatformVersion", "VersionNumber");
	capabilities.setCapability("AppPackage", AppPackage.getPath());
		
	driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
							
}

/*Simple Tabs run - app requieres been already installed and on the T&C's screen*/
@test
public void Open() {
	
	/*Accept Terms and conditions*/
	driver.findElementById("com.thefloow.flo:id/btn_agree").click();
	
	
	/*taken to Login screen*/
	/*Login Method 1*/
	driver.findElementById("com.thefloow.flo:id/edit_text_email");
	sendKeys("Mark.gillott@hotmail.com");
	
	driver.findElementById("com.thefloow.flo:id/edit_text_password");
	sendKeys("Password123#");
	
	driver.findElementById("com.thefloow.flo:id/btn_login").click();
	
	/*Should be logged in*/
	
	/*close opening messages*/
	driver.findElementById("com.thefloow.flo:id/btn_welcome_close").click();
	
	/*Press Some Buttons Main Screen*/
	driver.findElementById("com.thefloow.flo:id/btn_enable_gps").click();
	driver.navigate().back();
	driver.findElementById("com.thefloow.flo:id/btn_emergency").click();
	driver.findElementById("com.thefloow.flo:id/emergency_popup_close").click();
	
	/*Next Tab and Push more Buttons*/
	driver.findElementById("com.thefloow.flo:id/tab_journeys").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[4]").click();
	
	/*Score Tab and Push Some other Buttons*/
	driver.findElementById("com.thefloow.flo:id/tab_score").click();
	driver.findElementById("com.thefloow.flo:id/btn_score_information").click();
	driver.navigate().back();
	driver.findElementById("com.thefloow.flo:id/btn_component_score").click();
	driver.navigate().back();
	driver.findElementById("com.thefloow.flo:id/tab_social").click();
	driver.findElementById("com.thefloow.flo:id/social_menu_my_scores").click();
	driver.navigate().back();
	driver.findElementById("com.thefloow.flo:id/social_menu_friends").click();
	driver.navigate().back();
	driver.findElementById("com.thefloow.flo:id/social_menu_my_profile").click();
	driver.navigate().back();
	
	/*Help Push Many Many Buttons*/
	driver.findElementById("com.thefloow.flo:id/tab_help").click();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]").click();
	driver.navigate().back();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[2]").click();
	driver.navigate().back();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[3]").click();
	driver.navigate().back();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[4]").click();
	driver.navigate().back();
	driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[5]").click();
	driver.findElementById("com.thefloow.flo:id/spinner_categories").click();
	driver.navigate().back();
	driver.findElementById("com.thefloow.flo:id/image_view_logo").click();
	driver.navigate().back();
	
	/*Home And Close...No More buttons*/
	driver.findElementById("com.thefloow.flo:id/tab_home").click();
	driver.findElementById("com.thefloow.flo:id/btn_welcome_close").click();
}

private void sendKeys(String string) {
	// TODO Auto-generated method stub
	
}

//After the test...I think//
public void tearDown() {
	/*driver.quit();*/
	}
}

