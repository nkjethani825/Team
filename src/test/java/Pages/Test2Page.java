package Pages;

import PageObjects.Test2PageObjects;
import org.openqa.selenium.WebDriver;

public class Test2Page extends Test2PageObjects {
    WebDriver driver;
    public Test2Page(WebDriver driver)
    {
     this.driver=driver;
    }
    public void loadSite()
    {
        driver.get("https://www.gmail.com");
    }

    public void search(String searchText)
    {

    }

}
