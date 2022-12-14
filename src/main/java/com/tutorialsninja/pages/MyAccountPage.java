package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-9']/h1")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueBtn;
    @CacheLookup
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    WebElement logout;


    public String getAccountLogoutText() {
        Reporter.log("get account logout text " + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    public String getYourAccountHasBeenCreatedText() {
        Reporter.log("get your account has been created text " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public void clickOnMyAccount() {
        Reporter.log("Clicking on my account" + myAccount.toString());
        clickOnElement(myAccount);
    }

    public void clickOnContinueButton() {
        Reporter.log("Clicking on continue Button " + continueBtn.toString());
        clickOnElement(continueBtn);
    }

    public void clickOnLogoutButton() {
        Reporter.log("click on logout button " + logout.toString());
        clickOnElement(logout);
    }


}
