package com.travelbooking.pages;

import com.travelbooking.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromCity(String fromCity) {
        WaitUtils waitUtils = new WaitUtils(driver, 10);
        WebElement fromDropdown = waitUtils.waitForElementVisible(driver.findElement(By.name("fromPort")));
        new Select(fromDropdown).selectByVisibleText(fromCity);
    }

    public void selectToCity(String toCity) {
        WaitUtils waitUtils = new WaitUtils(driver, 10);
        WebElement toDropdown = waitUtils.waitForElementVisible(driver.findElement(By.name("toPort")));
        new Select(toDropdown).selectByVisibleText(toCity);
    }

    public void clickFindFlights() {
        driver.findElement(By.cssSelector("input[type='submit']")).click();
    }
}
