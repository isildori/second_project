package tests;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alert {
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
        mainPage.openUrl("https://demoqa.com/alerts");
        mainPage.click("//button[@id='alertButton']");
        mainPage.switchToAlert();
        mainPage.click("//button[@id='timerAlertButton']");

        mainPage.switchToAlert();
        mainPage.click("//button[@id='confirmButton']");
        mainPage.promtAssept();
        mainPage.getText("//span[@id='confirmResult']");

        Assert.assertTrue(mainPage.getText("//span[@id='confirmResult']").contains("You selected Ok"));
        mainPage.click("//button[@id='confirmButton']");
        mainPage.promtDismis();
         Assert.assertTrue(mainPage.getText("//span[@id='confirmResult']").contains("You selected Cancel"));
    }
}
