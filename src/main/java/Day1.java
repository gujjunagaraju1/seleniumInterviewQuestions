import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
   //How does Selenium communicate with browsers internally?
    //answer:w3c webdriver
    //followup question:Can we see that communication?
    //answer:Yes, Selenium sends W3C-compliant HTTP JSON commands to browser drivers. We can inspect these commands by enabling browser driver verbose logging.
    //follow up question: please show me with one example
   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.logfile","chromedriver.log");
       System.setProperty("webdriver.chrome.verboseLogging","true");
       WebDriver driver = new ChromeDriver();

       driver.get("https://www.cricbuzz.com/");
     String value=  driver.findElement(By.xpath("//div[contains(@class,\"carousal-item\")][1]//span[contains(@class,\"wb:text-xxs\")]")).getText();
     System.out.println(value);
   }

}
