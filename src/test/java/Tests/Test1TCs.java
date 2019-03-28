package Tests;

import Pages.Test1Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1TCs {

    Test1Page obj;
    @BeforeSuite
    public void beforeSuiteActions()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        obj=new Test1Page(driver);

    }

    @Test
    public void T11()
    {
        obj.loadSite();
    }
}
