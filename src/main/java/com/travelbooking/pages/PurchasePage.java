package com.travelbooking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

    WebDriver driver;

    // Locators
    private By chooseFlightBtn = By.xpath("(//input[@value='Choose This Flight'])[1]");
    private By nameField = By.id("inputName");
    private By addressField = By.id("address");
    private By cityField = By.id("city");
    private By stateField = By.id("state");
    private By zipCodeField = By.id("zipCode");
    private By cardTypeDropdown = By.id("cardType");
    private By creditCardNumberField = By.id("creditCardNumber");
    private By nameOnCardField = By.id("nameOnCard");
    private By purchaseFlightBtn = By.xpath("//input[@value='Purchase Flight']");

    // Constructor
    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void chooseFirstFlight() {
        driver.findElement(chooseFlightBtn).click();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(stateField).sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public void selectCardType(String cardType) {
        new Select(driver.findElement(cardTypeDropdown))
                .selectByVisibleText(cardType);
    }

    public void enterCardNumber(String cardNumber) {
        driver.findElement(creditCardNumberField).sendKeys(cardNumber);
    }

    public void enterNameOnCard(String name) {
        driver.findElement(nameOnCardField).sendKeys(name);
    }

    public void clickPurchaseFlight() {
        driver.findElement(purchaseFlightBtn).click();
    }
}
