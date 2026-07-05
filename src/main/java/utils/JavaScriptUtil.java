package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	private JavascriptExecutor js;

	public JavaScriptUtil(WebDriver driver) {

		js = (JavascriptExecutor) driver;

	}

	public void scrollIntoView(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void click(WebElement element) {

		js.executeScript("arguments[0].click()", element);

	}

}
