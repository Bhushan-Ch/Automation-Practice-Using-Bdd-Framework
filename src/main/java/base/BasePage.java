package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtil;

public class BasePage {


    protected WebDriver driver;
    protected ElementUtil elementUtil;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);

    }
}
