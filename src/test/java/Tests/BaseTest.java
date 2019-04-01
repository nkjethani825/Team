package Tests;

import io.qameta.allure.Attachment;
import org.apache.log4j.FileAppender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import java.io.File;

public class BaseTest {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    WebDriver driver;
    public BaseTest()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

    }

    public WebDriver getDriver()
    {
        return driver;
    }



}
