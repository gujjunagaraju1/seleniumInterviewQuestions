package org.example;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DAY3 {
    public static void main(String[] args) {
        //Right now we use WebDriver driver = new ChromeDriver(). How would you redesign this so that tests do not depend on specific browser instantiation? What OOP principles would you apply?
//        WebDriver driver=DriverFactory.getDriver("chrome");
//       // driver.get("https://www.redbus.in");
//        //if i call again driver it will save same more or create other object
//        //it will create now object
//      WebDriver driver1=DriverFactory.getDriver("chrome");
//        System.out.println(driver +" "+driver1);
//
//        //Even if I create two drivers, they need to map to the same object. How can this be achieved?
//        //Use the singleton in the DriverFactory
//        WebDriver driver2=DriverFactory.getDriver("firefox");
//        System.out.println(driver +" "+driver1 +" "+driver2);
        //Interview:Using a DriverFactory, you can create a singleton. But if you need two browsers, how can you achieve this?
        //answer:using hashmap we can slove this issue
        //use the TwoDriverConflict class
        WebDriver driver3=TwoDriverConflict.getDriver("chrome");
        WebDriver driver=TwoDriverConflict.getDriver("chrome");
        WebDriver driver4=TwoDriverConflict.getDriver("firefox");
        System.out.println(driver3 +" "+driver4 +" "+driver);



    }
}
