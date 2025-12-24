package com.travelbooking.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtils {

    public static void captureScreenshot(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            Path destDir = Path.of("screenshots");
            if (!Files.exists(destDir)) {
                Files.createDirectories(destDir);
            }

            Path destFile = destDir.resolve(testName + ".png");
            Files.copy(src.toPath(), destFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
