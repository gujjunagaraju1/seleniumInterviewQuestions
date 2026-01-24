package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class TwoDriverConflict {
    //Interview:Using a DriverFactory, you can create a singleton. But if you need two browsers, how can you achieve this?
    //answer:using hashmap we can slove this issue
    private static HashMap<String, WebDriver> drivers=new HashMap<>();
    public static WebDriver getDriver(String browser) {
        browser = browser.toLowerCase();
        if(!drivers.containsKey(browser)) {
            switch (browser){
                case "chrome":
                    drivers.put("chrome", new ChromeDriver());
                    break;
                case "firefox":
                    drivers.put("firefox", new FirefoxDriver());
                    break;
                case "edge":
                    drivers.put("edge", new EdgeDriver());
                default:
                    throw new RuntimeException("Unsupported browser: " + browser);
            }
        }
        return drivers.get(browser);

    }
}
