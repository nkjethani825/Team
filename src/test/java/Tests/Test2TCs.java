package Tests;

import Pages.Test2Page;
import io.qameta.allure.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

@Epic("Regression")
@Feature("Feature TCs")
public class Test2TCs extends BaseTest {
    WebDriver driver;
    Logger log=Logger.getLogger(Test2TCs.class.getName());
    Test2Page obj;



    public Test2TCs()
    {
        driver=getDriver();
        obj=new Test2Page(driver);
    }

    @Step("T21 Step")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("T21 Feature")
    @Description("T21 Description")
    @Test(description = "T21")public void T21() throws InterruptedException {
        Thread.sleep(20000);
        obj.loadSite();
        log.info("Site Loaded");
        saveScreenshot(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES));
    }

    @Step("T22 Step")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("T21 Feature")
    @Description("T22 Description")
    @Test(description = "T22")
    public void T22()
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
