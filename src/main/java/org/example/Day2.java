package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.nio.file.Path;
import java.util.Optional;

public class Day2 {
    public static void main(String[] args) {
        WebDriver driver ;
   //How do you check whether Chrome browser is installed before running Selenium tests?
        //How to check whether chromedriver is downloaded or not,if downloaded can you print the path
        Optional<Path> browser= WebDriverManager.chromedriver().getBrowserPath();
        if (browser.isPresent()) {
            System.out.println(browser.get().toString());

        }







    }
}
