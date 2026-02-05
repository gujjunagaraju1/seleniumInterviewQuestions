import org.example.BaseClass;
import org.example.DriverFactory;
import org.example.TwoDriverConflict;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.*;
import java.util.List;

public class BrokenImageTest {
    @Test
    public void brokeTime() {
        WebDriver driver = BaseClass.getDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images");
        List<WebElement> Images = driver.findElements(By.cssSelector("h3~img"));
        for (WebElement Image : Images) {
            String imageURL = Image.getAttribute("src");
            HttpURLConnection urlConnection = null;
            try {
               // URL url= new URI(imageURL).toURL();

            urlConnection=(HttpURLConnection)  new URI(imageURL).toURL().openConnection();

          urlConnection.setRequestMethod("HEAD");
         int status=  urlConnection.getResponseCode();
         if(status==200){
             System.out.println("Not Broken Image"+imageURL);
         }



            } catch (URISyntaxException | IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                urlConnection.disconnect();
            }



        }
        BaseClass.quitDriver();
    }
}
