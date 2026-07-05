package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ButtonInteractionPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class ButtonInteractionSteps {

	private final ButtonInteractionPage interactionPage = new ButtonInteractionPage(DriverFactory.getDriver());

	@When("User clicks on Single Click button")
	public void user_clicks_on_single_click_button() {
		interactionPage.clickSingleButton();
	}

	@Then("Single click sucess message should be displayed")
	public void single_click_sucess_message_should_be_displayed() {
		// assertion

		String actualMessage = interactionPage.getSingleClickMessage();
		String expectedMessage = "Single clicked!";
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Single Click success message validation failed.");
	}

	@When("User double clicks on Double Click button")
	public void user_double_clicks_on_double_click_button() {
		interactionPage.clickDoubleButton();
	}

	@Then("Double Click success message should be displayed")
	public void double_click_success_message_should_be_displayed() {
		// assertion
		String actualMessage = interactionPage.getDoubleClickMessage();
		String expectedMessage = "Double clicked!";
		System.out.println(actualMessage);

		Assert.assertEquals(actualMessage, expectedMessage, "Double Click success message validation failed.");
	}

	@When("User right clicks on Right Click button")
	public void user_right_clicks_on_right_click_button() {

		interactionPage.clickRightButton();

	}

	@Then("Right click sucess message should be displayed")
	public void right_click_sucess_message_should_be_displayed() {
		String actualMessage = interactionPage.getRightClickMessage();
		String expectedMessage = "Right clicked!";
		System.out.println(actualMessage);

	}

	@When("User tries to click Disabled button")
	public void user_tries_to_click_disabled_button() {

		interactionPage.isDisabledButtonEnabled();

	}

	@Then("Disabled button should remain disabled")
	public void disabled_button_should_remain_disabled() {
		Assert.assertFalse(interactionPage.isDisabledButtonEnabled(), "Disabled button should not be enabled.");

	}

	@When("User clicks on Start 3s Timer button")
	public void user_clicks_on_start_3s_timer_button() {

		interactionPage.clickStartTimerButton();

	}

	@Then("Enable button should be enabled after 3 seconds")
	public void enable_button_should_be_enabled_after_3_seconds() {

		Assert.assertTrue(interactionPage.waitForEnableButton(), "Enable button is not enabled after 3 seconds.");

	}

}