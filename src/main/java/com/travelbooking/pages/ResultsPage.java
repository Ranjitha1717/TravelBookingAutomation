package com.travelbooking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ResultsPage {
    private WebDriver driver;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFlightPrice(int index) {
        List<WebElement> prices = driver.findElements(By.cssSelector("td:nth-child(6)"));
        return prices.get(index).getText().replace("$", "").trim();
    }

    public void chooseFlight(int index) {
        List<WebElement> buttons = driver.findElements(By.cssSelector("input[type='submit']"));
        buttons.get(index).click();
    }
}
