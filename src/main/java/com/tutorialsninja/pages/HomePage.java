package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    WebElement topMenu;


    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;


    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement lapTopsAndNotebook;


    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement components;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currencyTab;

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    WebElement currencyList;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;

    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    List<WebElement> myAccountOptions;


    public void selectMenu(String menu) {

        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void mouseHoverOnDesktopsLinkAndClick() {
        Reporter.log("mousehover on desktops link and click" + desktop.toString());
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverOnLaptopsAndNotebooksLinkAndClick() {
        Reporter.log("mousehover on laptops and notebooks link and click" + lapTopsAndNotebook.toString());
        mouseHoverToElementAndClick(lapTopsAndNotebook);
    }

    public void mouseHoverOnComponentLinkAndClick() {
        Reporter.log("mousehover on components link and click" + components.toString());
        mouseHoverToElementAndClick(components);
    }

    public void selectCurrency(String currency) {
        clickOnElement(currencyTab);
        List<WebElement> listOfElements = getListOfElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
    }


    public void clickOnMyAccountTab() {
        Reporter.log("click on my account tab" + myAccountTab.toString());
        clickOnElement(myAccountTab);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    private List<WebElement> getListOfElements(List<WebElement> myAccountOptions) {
        return myAccountOptions;
    }


}
