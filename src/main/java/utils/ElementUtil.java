package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

	private WebDriver driver;

	private WaitUtil waitUtil;

	public ElementUtil(WebDriver driver) {

		this.driver = driver;

		waitUtil = new WaitUtil(driver);

	}

	public void click(By locator) {

		waitUtil.waitForClickable(locator).click();

	}

	public void type(By locator, String value) {

		WebElement element = waitUtil.waitForVisible(locator);

		element.clear();

		element.sendKeys(value);

	}

	public String getText(By locator) {

		return waitUtil.waitForVisible(locator).getText();

	}

	public boolean isDisplayed(By locator) {

		return waitUtil.waitForVisible(locator).isDisplayed();

	}

	public boolean isEnabled(By locator) {

		return waitUtil.waitForVisible(locator).isEnabled();

	}

	public void doubleClick(By locator) {

		new Actions(driver)

				.doubleClick(waitUtil.waitForClickable(locator))

				.perform();

	}

	public String getAttribute(By locator, String attributeName) {
		return waitUtil.waitForVisible(locator).getAttribute(attributeName);
	}

	public void rightClick(By locator) {

		new Actions(driver)

				.contextClick(waitUtil.waitForClickable(locator))

				.perform();

	}
	public boolean waitUntilElementEnabled(By locator) {

	    return waitUtil.waitForElementToBeEnabled(locator).isEnabled();
	}
}
