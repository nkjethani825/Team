package Tests;

import Pages.Test1Page;
import io.qameta.allure.*;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
@Epic("Regression")
@Feature("Feature TCs")
public class Test1TCs extends BaseTest {

    WebDriver driver;
    Logger log=Logger.getLogger(Test1TCs.class.getName());


    Test1Page obj;
    public Test1TCs() {
        driver=getDriver();
        obj=new Test1Page(driver);
    }

        @Step("T11 Step")
        @Severity(SeverityLevel.BLOCKER)
        @Feature("T11 Feature")
        @Description("T11 Description")
        @Test(description = "T11")
    public void T11()
    {
        obj.loadSite();
        log.info("Site Loaded");
        saveScreenshot(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES));

    }

    @Step("T12 Step")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("T11 Feature")
    @Description("T12 Description")
    @Test(description = "T12")
    public void T12()
    {
        obj.loadSite();
        log.info("Site Loaded");
        saveScreenshot(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES));

    }

    @AfterClass
    public void afterClass()
    {
        getDriver().quit();
    }
}
