package com.acts.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acts.utils.Utils;

public class TestRadioButton {
    private WebDriver driver;

    String url = "https://demo.automationtesting.in/Register.html";

    @BeforeClass
    public void setUp() {
        driver = Utils.getWebDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testRadioButton() {
        Utils.selectRadioButton(driver, By.cssSelector("input[type='radio']"), "FeMale");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
