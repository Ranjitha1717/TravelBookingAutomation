package com.travelbooking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage {
    private WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPassengerDetails(String name, String address, String city, String state,
                                      String zip, String cardType, String cardNumber, String nameOnCard) {
        driver.findElement(By.id("inputName")).sendKeys(name);
        driver.findElement(By.id("address")).sendKeys(address);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("state")).sendKeys(state);
        driver.findElement(By.id("zipCode")).sendKeys(zip);
        driver.findElement(By.id("cardType")).sendKeys(cardType);
        driver.findElement(By.id("creditCardNumber")).sendKeys(cardNumber);
        driver.findElement(By.id("nameOnCard")).sendKeys(nameOnCard);
    }

    public void clickPurchase() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}
