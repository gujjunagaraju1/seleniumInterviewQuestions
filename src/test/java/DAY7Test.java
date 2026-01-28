import Listerners.TestListerners;
import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListerners.class)
public class DAY7Test {
    @Test

    public void RunNegative(){
        WebDriver driver = BaseClass.getDriver();
        driver.get("https://www.google.com/");
       String answer= driver.findElement(By.cssSelector("a[class=\"MV3Tnb\"]")).getText();
        Assert.assertEquals(answer,"Nagaraju");


    }


}
