package main_pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.elements.ElementsPage;

import java.time.Duration;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public static final String HOME_BANNER = "//div[@class='home-banner'][a[@href='https://www.toolsqa.com/selenium-training/']]";
    public static final String BLOCK_XPATH = "//div[@class='card mt-4 top-card']";
    public static final String CATEGORY_BLOCKS_XPATH = BLOCK_XPATH + "/div[div/h5[text()='%s']]";

    public void openCategory(String categoryName){
        click(String.format(CATEGORY_BLOCKS_XPATH,categoryName));
    }

    public ElementsPage openCategoryElements(){
        openCategory("Elements");
        return new ElementsPage(driver);
    }

    public void openCategoryForms(){
        openCategory("Forms");
    }
    public void switchToAlert(){
         new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        Alert alert1 = driver.switchTo().alert();

        alert1.accept();


    }
    public void promtAssept(){
         new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
         Alert alert2 = driver.switchTo().alert();

         alert2.accept();
    }
     public void promtDismis(){
         new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
         Alert alert1 = driver.switchTo().alert();

         alert1.dismiss();
    }
}

