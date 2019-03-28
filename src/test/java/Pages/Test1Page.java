package Pages;

import PageObjects.Test1PageObjects;
import org.openqa.selenium.WebDriver;

public class Test1Page extends Test1PageObjects {

    WebDriver driver;
    public Test1Page(WebDriver driver)
    {
        this.driver=driver;
    }

    public void loadSite()
    {
        driver.get("https://www.google.com");
    }

    public void search(String searchText)
    {

    }

}
