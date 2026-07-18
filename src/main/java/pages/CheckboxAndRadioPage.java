package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class CheckboxAndRadioPage extends BasePage {

	public CheckboxAndRadioPage(WebDriver driver) {
		super(driver);

	}

	private final By chkSelectAll = By.id("select-all");

	private final By chkOptionA = By.xpath("//label[@class='flex items-center gap-2 text-sm']/following::input[@id='check-a']");

	private final By chkOptionB = By.xpath("//label[@class='flex items-center gap-2 text-sm']/following::input[@id='check-b']");

	private final By chkOptionC = By.xpath("//label[@class='flex items-center gap-2 text-sm']/following::input[@id='check-c']");

	private final By radioChoiceOne = By.id("radio-one");

	private final By radioChoiceTwo = By.id("radio-two");

	private final By selectedRadioText = By.id("radio-result");

	private final By chkRevealText = By.id("reveal-checkbox");

	private final By hiddenText = By.id("hidden-text");
	

	public void selectChkAll() {

		elementUtil.click(chkSelectAll);
	}
	
	public boolean areAllCheckboxesSelected() {

	    return elementUtil.isSelected(chkOptionA)
	            && elementUtil.isSelected(chkOptionB)
	            && elementUtil.isSelected(chkOptionC);
	}

}
