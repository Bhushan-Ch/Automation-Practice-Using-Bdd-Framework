package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class BasicFormPage extends BasePage {

    public BasicFormPage(WebDriver driver) {
        super(driver);
    }

    // ===========================
    // Locators
    // ===========================

    private final By txtName = By.xpath("//input[@placeholder='Enter your name']");
    private final By txtPassword = By.xpath("//input[@placeholder='Enter password']");
    private final By txtEmail = By.xpath("//input[@placeholder='Enter email']");
    private final By txtPhone = By.xpath("//input[@placeholder='Enter phone']");
    private final By txtDescription = By.xpath("//textarea");
    private final By btnSubmit = By.xpath("//button[text()='Submit']");
    private final By btnReset = By.xpath("//button[text()='Reset']");
    private final By lblStatus = By.xpath("//p");

    // ===========================
    // Actions
    // ===========================

    public BasicFormPage enterName(String name) {
        elementUtil.type(txtName, name);
        return this;
    }

    public BasicFormPage enterPassword(String password) {
        elementUtil.type(txtPassword, password);
        return this;
    }

    public BasicFormPage enterEmail(String email) {
        elementUtil.type(txtEmail, email);
        return this;
    }

    public BasicFormPage enterPhone(String phone) {
        elementUtil.type(txtPhone, phone);
        return this;
    }

    public BasicFormPage enterDescription(String description) {
        elementUtil.type(txtDescription, description);
        return this;
    }

    public BasicFormPage clickSubmit() {
        elementUtil.click(btnSubmit);
        return this;
    }

    public BasicFormPage clickReset() {
        elementUtil.click(btnReset);
        return this;
    }

    // ===========================
    // Validations
    // ===========================

    public String getSubmissionStatus() {
        return elementUtil.getText(lblStatus);
    }

    public boolean isFormCleared() {
        return elementUtil.getAttribute(txtName, "value").isEmpty()
                && elementUtil.getAttribute(txtPassword, "value").isEmpty()
                && elementUtil.getAttribute(txtEmail, "value").isEmpty()
                && elementUtil.getAttribute(txtPhone, "value").isEmpty()
                && elementUtil.getAttribute(txtDescription, "value").isEmpty();
    }
}