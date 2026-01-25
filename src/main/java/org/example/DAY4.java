package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class DAY4 {

public static void main(String[] args) {
//How many ways we can preform drag and drop

    WebDriver driver = TwoDriverConflict.getDriver("chrome");
    driver.get("https://demoqa.com/droppable");
    WebElement drag = driver.findElement(By.id("draggable"));
    WebElement drop = driver.findElement(By.id("droppable"));
    //1)using draganddrop method in action
//    Actions action=new Actions(driver);
//    action.dragAndDrop(drag,drop).perform();
//    try {
//        Thread.sleep(2000);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    }
    //2. More compactability using not using drag and drop
//    Actions actions = new Actions(driver);
//    actions.clickAndHold(drag).pause(Duration.ofMillis(2000))
//            .moveToElement(drop).
//            pause(Duration.ofMillis(2000)).
//
//            release().build().perform();
//    try {
//        Thread.sleep(4000);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    }
   //“HTML5 drag-and-drop fails in Selenium because it relies on JavaScript drag events and the DataTransfer API, which Actions doesn’t fully trigger. That’s why JavaScript-based drag-and-drop is more reliable
   //final code
    //if below code need to work then it need to be HTML5 API
    //we are using iquery website so i will not work only action will work
//    JavascriptExecutor js=(JavascriptExecutor)driver;
//    js.executeScript("arguments[0].dispatchEvent(new DragEvent('dragstart',{dataTransfer:new DataTransfer()}));" +
//                    "arguments[1].dispatchEvent(new DragEvent('dragover',{dataTransfer:new DataTransfer()}));" +
//                    "arguments[1].dispatchEvent(new DragEvent('drop',{dataTransfer:new DataTransfer()}));" +
//                    "arguments[0].dispatchEvent(new DragEvent('dragend',{dataTransfer:new DataTransfer()}));",
//            drag,
//            drop
//
//            );
   driver.quit();
}

}
