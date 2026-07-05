package utils;

import org.openqa.selenium.WebDriver;

public class BrowserUtil {
	
	 private WebDriver driver;

	    public BrowserUtil(WebDriver driver) {

	        this.driver = driver;

	    }

	    public String getTitle() {

	        return driver.getTitle();

	    }

	    public String getCurrentUrl() {

	        return driver.getCurrentUrl();

	    }

	    public void refresh() {

	        driver.navigate().refresh();

	    }

	    public void back() {

	        driver.navigate().back();

	    }

	    public void forward() {

	        driver.navigate().forward();

}
}
