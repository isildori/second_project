package tests;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CCheck_box {
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
        mainPage.openUrl("https://demoqa.com/checkbox");
        mainPage.waitElementDisplayed("//div[@class='rct-options']/button[@aria-label='Expand all']", 20);
        mainPage.click("//div[@class='rct-options']/button[@aria-label='Expand all']");
        mainPage.setCheckBox("Notes",true);
        Assert.assertTrue(mainPage.getCheckBoxState("Notes"));
        Assert.assertTrue(mainPage.getText("//div[@id='result']/span[1]").contains("You have selected"));
    }
}
