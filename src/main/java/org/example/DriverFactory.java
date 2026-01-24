package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {

        //using singleton to achieve what written in day 3
        if (driver==null) {
            if (browser.equals("chrome")) {
                return driver = new ChromeDriver();
            }
            if (browser.equals("firefox")) {
                return driver = new FirefoxDriver();
            }
            else{
                throw new RuntimeException("Browser not supported: " + browser);
            }

        }
        return driver;


    }
}
