package tests;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Forms_add {
    private WebDriver driver;
    private MainPage mainPage;
    @BeforeClass
    public void beforeClass() {
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        //mainPage.openStartPage();

    }

    @AfterClass
    public void afterClass() {
       driver.quit();
    }
    @Test
    public void step_01(){
        mainPage.openUrl("https://demoqa.com/webtables");
        String locator = "//button[@id='addNewRecordButton']";
        mainPage.click(locator);
        mainPage.sendKeys("//input[@id='firstName']", "Alex");
        mainPage.sendKeys("//input[@id='lastName']", "Step");
        mainPage.sendKeys("//input[@id='userEmail']", "praynek@yandex.ru");
        mainPage.sendKeys("//input[@id='age']", "22");
        mainPage.sendKeys("//input[@id='salary']", "24");
        mainPage.sendKeys("//input[@id='department']", "asd");
        String locator2 =   "//button[@id='submit']";
        mainPage.click(locator2);





    }
}
