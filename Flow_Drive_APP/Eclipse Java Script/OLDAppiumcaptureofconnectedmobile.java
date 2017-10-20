//Note for this script I planed to break it up in to a series of smaller tests making it a bit simpler.
//but if this is the script youre getting that dint happen for whatever reason.
package Tabs_Script;

import java.sql.Driver;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
/*Guess work as to what to put here 16/10/2017*/
public class Flow_TabsRun {
		
//Before --- Capabilities???//
public void setup() throws malformedURLException() {
	DesiredCapabilities desiredCapabilities = new desiredCapabilities();
	desiredCapabilities.setCapability ("DeviceName": "AndroidPhone");
	desiredCapabilities.setCapability ("PlatformName": "Android");
	desiredCapabilities.setCapability("PlatformVersion": "6.0.1");
	desiredCapabilities.setCapability("AppPackage", AppPath ());
		
		URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub")
		driver = new AndroidDriver(remoteUrl, DesiredCapabilities);
		driver = new AndroidDriver<AndroidElement>
}*/

//Simple Tabs run - app requieres been already installed and on the T&C's screen//
@test
public void Open() {
	
	/*Accept Terms and conditions*/

driver.findElementById("com.thefloow.flo:id/btn_agree").click();
	/*taken to Login screen*/
	
	/*Login Method 1*/
	driver.findElementById("com.thefloow.flo:id/edit_text_email");
	el2.sendKeys("Mark.gillott@hotmail.com");
	driver.findElementById("com.thefloow.flo:id/edit_text_password");
	el3.sendKeys("Password123#");
	MobileElement el4 = (MobileElement) driver.findElementById("com.thefloow.flo:id/btn_login");
	el4.click();
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
	driver.findElementBy.id("com.thefloow.flo:id/btn_welcome_close").click();
}

//After the test...I think//
public void tearDown() {
	/*driver.quit();*/
	}
}

