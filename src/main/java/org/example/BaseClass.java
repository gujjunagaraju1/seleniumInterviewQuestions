package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
    private static WebElement driver;
    public static WebDriver getDriver() {
        return TwoDriverConflict.getDriver("chrome");
    }
    public static void quitDriver() {
         TwoDriverConflict.closeDriver("chrome");
    }

}
