package pages;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import base.BasePage;

public class ButtonInteractionPage extends BasePage {

	public ButtonInteractionPage(WebDriver driver) {

		super(driver);

	}

	private final By singleClick = By.id("single-click-btn");

	private final By doubleClick = By.id("double-click-btn");

	private final By rightClick = By.id("right-click-btn");

	private final By disabledBtn = By.id("disabled-btn");

	private final By singleClickMessage = By.xpath("//p[text()='Single clicked!']");

	private final By doubleClickMessage = By.xpath("//p[text()='Double clicked!']");

	private final By startTimerBtn = By.id("start-delay-btn");

	private final By enableBtn = By.id("delayed-enable-btn");

	private final By rightClickMessage = By.xpath("//p[text()='Right click captured (context menu blocked)']");

	public void clickSingleButton() {

		elementUtil.click(singleClick);

	}

	public void clickDoubleButton() {

		elementUtil.doubleClick(doubleClick);

	}

	public void clickRightButton() {

		elementUtil.rightClick(rightClick);

	}

	public String getSingleClickMessage() {

		return elementUtil.getText(singleClickMessage);

	}

	public String getDoubleClickMessage() {

		return elementUtil.getText(doubleClickMessage);

	}

	public String getRightClickMessage() {

		return elementUtil.getText(rightClickMessage);

	}

	public boolean isDisabledButtonEnabled() {

		return elementUtil.isEnabled(disabledBtn);

	}

	public void clickStartTimerButton() {
		elementUtil.click(startTimerBtn);
	}

	public boolean waitForEnableButton() {
		return elementUtil.waitUntilElementEnabled(enableBtn);
	}

}