package tests;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Forms {
    private WebDriver driver;
    private MainPage mainPage;
    private WebElement html;

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
        mainPage.openUrl("https://demoqa.com/automation-practice-form");
        mainPage.sendKeys("//input[@id='firstName']", "firstName");
        mainPage.sendKeys("//input[@id='lastName']", "lastName");
        mainPage.sendKeys("//input[@id='userEmail']", "usermail@mail.ru");
        mainPage.click("//label[@for='gender-radio-1']");
        mainPage.sendKeys("//input[@id='userNumber']", "8920733456");
        mainPage.click("//input[@id='dateOfBirthInput']");
        mainPage.click("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']");
        mainPage.click("//option[@value='1974']");
        mainPage.click("//div[@class='react-datepicker__day react-datepicker__day--018']");
        mainPage.sendKeys("//input[@id='subjectsInput']", "p");
        mainPage.waitElementDisplayed("//label[@for='hobbies-checkbox-1']", 20);
        mainPage.click("//div[@id='react-select-2-option-0']");

        mainPage.click("//label[@for='hobbies-checkbox-1']");

        //driver.findElement(By.id("myUploadElement")).sendKeys("<absolutePathToMyFile>");
        mainPage.sendKeys("//input[@id='uploadPicture']", "C://Test//Диаграмма без названия.drawio.png");
        mainPage.sendKeys("//textarea[@id='currentAddress']", "currentAddress");
        mainPage.sendKeys("//input[@id='react-select-3-input']", "n");
        mainPage.waitElementDisplayed("//label[@for='hobbies-checkbox-1']", 20);
        mainPage.click("//div[@id='react-select-3-option-0']");
        mainPage.sendKeys(  "//input[@id='react-select-4-input']", "d");
        mainPage.waitElementDisplayed("//label[@for='hobbies-checkbox-1']", 20);
        mainPage.click("//div[@id='react-select-4-option-0']");
        driver.findElement(By.xpath("//button[@id='submit']")).sendKeys(Keys.RETURN);
        

    }


}
