package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.util.HashMap;
import java.util.Map;

public class MobileEmulationHelpers {


    static WebDriver driver = DriverHelpers.getDriver();
    static ChromeOptions chromeOptions = new ChromeOptions();
    static String rootLocation = "/Users/Mark.Gamble/Documents/Selenium";



    public static WebDriver SetMobileEmulation(String inURL, String Device) {


            Map<String, String> mobileEmulation = new HashMap<String, String>();
            mobileEmulation.put("deviceName", Device);

            //chromeOptions.put("mobileEmulation", mobileEmulation);

            System.setProperty("webdriver.chrome.driver", rootLocation + "/chromedriver");
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

            if (driver != null) {
                driver.quit();
                driver = null;
            }

            driver = new ChromeDriver(chromeOptions);
            return driver;
    }


    public static void movetoElementandTapCSS(String CSS) throws InterruptedException {

        WebElement element = driver.findElement(By.cssSelector(CSS));

        if (element != null) {

            Actions action = new TouchActions(driver);
            action.moveToElement(element);
            action.contextClick(element);

        }
    }
}
