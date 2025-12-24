package com.travelbooking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    WebDriver driver;

    // Locators (validated against BlazeDemo)
    private By confirmationHeading = By.tagName("h1");
    private By amountText = By.xpath("//p[contains(text(),'Amount')]");
    private By idText = By.xpath("//td[text()='Id']/following-sibling::td");
    private By statusText = By.xpath("//td[text()='Status']/following-sibling::td");

    // Constructor
    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions / Getters
    public String getConfirmationMessage() {
        return driver.findElement(confirmationHeading).getText();
    }

    public String getAmount() {
        return driver.findElement(amountText).getText();
    }

    public String getTransactionId() {
        return driver.findElement(idText).getText();
    }

    public String getStatus() {
        return driver.findElement(statusText).getText();
    }
}
