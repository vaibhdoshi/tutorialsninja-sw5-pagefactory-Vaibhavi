package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class AccountRegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement LastNameField;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;
    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    List<WebElement> subscribeRadios;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    public String getRegisterAccountText() {
        Reporter.log("get register account text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String fName) {
        Reporter.log("Enter firstname " + fName + " to first name field" + firstNameField.toString());
        sendTextToElement(firstNameField, fName);
    }

    public void enterLastName(String lName) {
        Reporter.log("Enter last name " + lName + " to last name field" + firstNameField.toString());
        sendTextToElement(LastNameField, lName);
    }

    public void enterEmail(String email) {
        Reporter.log("Enter email " + email + " to email field" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone) {
        Reporter.log("Enter telephone " + telephone + " to telephone field" + telephoneField.toString());
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cPassword) {
        Reporter.log("Enter confirm password " + cPassword + " to confirm password field" + passwordConfirmField.toString());
        sendTextToElement(passwordConfirmField, cPassword);
    }

    public void selectSubscription(String option) {
        List<WebElement> radioButtons = getListOfElements(subscribeRadios);
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
    }

    private List<WebElement> getListOfElements(List<WebElement> subscribeRadios) {
        return subscribeRadios;
    }


    public void clickOnPrivacyPolicyCheckBox() {
        Reporter.log("click on privacy policy check box " + privacyPolicyCheckBox.toString());
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickOnContinueButton() {
        Reporter.log("click on continue button " + continueBtn.toString());
        clickOnElement(continueBtn);
    }


}
