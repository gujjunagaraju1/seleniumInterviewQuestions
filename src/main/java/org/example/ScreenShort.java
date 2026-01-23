package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShort {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
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

    }
}
