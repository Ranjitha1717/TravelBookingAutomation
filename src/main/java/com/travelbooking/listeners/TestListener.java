package com.travelbooking.listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.travelbooking.tests.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object testInstance = result.getInstance();

        if (testInstance instanceof BaseTest) {
            BaseTest baseTest = (BaseTest) testInstance;

            ScreenshotUtils.captureScreenshot(
                    baseTest.driver,
                    result.getName()
            );
        }
    }
}
