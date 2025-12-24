package com.travelbooking.pages;

import com.travelbooking.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookingSummaryPage {

    private WebDriver driver;
    private WaitUtils wait;

    // Constructor
    public BookingSummaryPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver, 10);
    }

    // Locators
    private By totalFare = By.id("totalFare");
    private By confirmButton = By.id("confirmBooking");

    // Actions
    public String getTotalFare() {
        WebElement element = wait.waitForElementVisible(driver.findElement(totalFare));
        return element.getText();
    }

    public void clickConfirmBooking() {
        WebElement element = wait.waitForElementClickable(driver.findElement(confirmButton));
        element.click();
    }
}
