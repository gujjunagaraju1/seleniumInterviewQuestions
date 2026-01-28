package Listerners;



import ScreenshortUtils.ScreenShort;
import org.example.BaseClass;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;


import reports.ExtentReports;

public class TestListerners  implements ITestListener {




    @Override
    public void onStart(ITestContext context) {
        Reporter.log("passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot src=(TakesScreenshot) BaseClass.getDriver();
        String path = ScreenShort.takeScreenshot(BaseClass.getDriver(),result.getTestName());
        Reporter.log("Test failed: " + result.getName());
        Reporter.log("<a href='" + path + "' target='_blank'>Screenshot</a>");
    }

}
