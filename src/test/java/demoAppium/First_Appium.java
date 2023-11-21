package demoAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class First_Appium {

	public static void main(String[] args) throws MalformedURLException {
		{
			  DesiredCapabilities cap = new DesiredCapabilities();
			  cap.setCapability ("deviceName" ,"Samsung");
			  cap.setCapability ("udid", "R9ZW609XSDD");
			  cap.setCapability ("platformName" , "Android");
			  cap.setCapability ("platformVersion" , "13");
			  cap.setCapability ("appPackage","io.appium.android.apis");
			  cap.setCapability ("appActivity",".ApiDemos");
			  cap.setCapability("automationName", "UiAutomator2");
			  
			  AndroidDriver driver1 = new AndroidDriver(new URL ("http://127.0.0.1:4723/"),cap);
			  System.out.println("test");
			  
			  // type this "ElementOption" to get element from "ElementOption" while using touch options
//			  PointerInput finger =new PointerInput(Kind.TOUCH,"finger" );
//			  Interaction move = finger.createPointerMove(Duration.ZERO, Origin.viewport(),200, 200);
//			  Interaction createPointerUp = finger.createPointerUp(MouseButton.LEFT.asArg());
			  driver1.perform(Arrays.asList( ));
			  driver1.quit();
			}
	}

}
