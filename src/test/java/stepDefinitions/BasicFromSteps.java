package stepDefinitions;

import java.util.Iterator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicFormPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class BasicFromSteps {
	ConfigReader config = new ConfigReader();

	 BasicFormPage formPage;
	 
	 @Given("User lauches the application")
	 public void user_lauches_the_application() {
		 DriverFactory.getDriver().get(config.getURL());
	 }
	           

	@Given("User in on basic Form page")
	public void user_in_on_basic_form_page() {
		
		
		formPage = new BasicFormPage(DriverFactory.getDriver());
		

		
		
			
	}

	@When("User enters name {string}")
	public void user_enters_name(String name) {
		
		formPage.enterName(name);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		
		formPage.enterPassword(password);
		
	}

	@When("User enters email {string}")
	public void user_enters_email(String email) {
		formPage.enterEmail(email);
		
		
	}

	@When("User enters phone {string}")
	public void user_enters_phone(String phone) {
		
		formPage.enterPhone(phone);

	}

	@When("User enters description {string}")
	public void user_enters_description(String desc) {
		
		formPage.enterDescription(desc);

	}

	@When("User clicks Submit button")
	public void user_clicks_submit_button() {
		formPage.clickSubmit();

	}

	@Then("Form should be submitted successfully")
	public void form_should_be_submitted_successfully() {
		
		

	}

}
