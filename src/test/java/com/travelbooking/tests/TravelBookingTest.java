package com.travelbooking.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.travelbooking.pages.ConfirmationPage;
import com.travelbooking.pages.PurchasePage;
import com.travelbooking.pages.SearchPage;




public class TravelBookingTest extends BaseTest {

    @Test
    public void searchFlightTest() {

        // Step 1: Open application
        driver.get("https://blazedemo.com");

        // Step 2: Search flights
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectFromCity("Paris");
        searchPage.selectToCity("London");
        searchPage.clickFindFlights();

        // Basic validation
        Assert.assertTrue(driver.getTitle().contains("BlazeDemo"),
                "Flight search page not loaded");
    }

    @Test
    public void endToEndBookingTest() {

        // Step 1: Open application
        driver.get("https://blazedemo.com");

        // Step 2: Search flights
        SearchPage searchPage = new SearchPage(driver);
        searchPage.selectFromCity("Boston");
        searchPage.selectToCity("London");
        searchPage.clickFindFlights();

        // Step 3: Select first available flight
        PurchasePage purchasePage = new PurchasePage(driver);
        purchasePage.chooseFirstFlight();

        // Step 4: Enter passenger & payment details
        purchasePage.enterName("John Doe");
        purchasePage.enterAddress("123 Main Street");
        purchasePage.enterCity("Boston");
        purchasePage.enterState("MA");
        purchasePage.enterZipCode("02101");
        purchasePage.selectCardType("Visa");
        purchasePage.enterCardNumber("4111111111111111");
        purchasePage.enterNameOnCard("John Doe");
        purchasePage.clickPurchaseFlight();

        // Step 5: Validate confirmation page
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        String confirmationText = confirmationPage.getConfirmationMessage();

        Assert.assertTrue(confirmationText.contains("Thank you"),
                "Booking confirmation failed");
    }
}
