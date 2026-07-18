package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckboxAndRadioPage;
import utils.DriverFactory;

public class CheckboxAndRadioSteps {
	
	

	private final CheckboxAndRadioPage checkboxAndRadioPage = new CheckboxAndRadioPage(DriverFactory.getDriver());
	
	@When("User selects the Select All checkbox")
	public void user_selects_the_select_all_checkbox() {
		
		checkboxAndRadioPage.selectChkAll();
	   
	}

	@Then("All option checkbox should be selected")
	public void all_option_checkbox_should_be_selected() {
		Assert.assertTrue(checkboxAndRadioPage.areAllCheckboxesSelected() );
	   
	}


	
	

}
