package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText ;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getReturningCustomerText() {
        Reporter.log( "get returning customer text" + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);

    }

    public String getNewCustomerText() {
        Reporter.log("get new customer text" + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        Reporter.log("Enter email " + email + " to email field " + emailAddressField.toString());
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter email " + password + " to email field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button " + loginBtn.toString());
        clickOnElement(loginBtn);
    }


}
