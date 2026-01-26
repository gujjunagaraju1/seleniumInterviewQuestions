package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShort {
   private static String browser="chrome";
    public static void main(String[] args) {

        WebDriver driver = TwoDriverConflict.getDriver(browser);
        //full screenshort
//        TakesScreenshot ts=(TakesScreenshot) driver;
//        driver.get("https://www.google.com");
//        File src=ts.getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(src,new File("Screenshort/abc.png"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        finally {
//            driver.quit();
//        }
//particular element screenshort
        driver.get("https://www.google.com/");
        WebElement search=driver.findElement(By.name("q"));
        File file=search.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshort/vng.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        TwoDriverConflict.closeDriver(browser);

    }
}
