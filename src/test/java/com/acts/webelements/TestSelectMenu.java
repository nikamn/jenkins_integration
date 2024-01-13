package com.acts.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acts.utils.Utils;

public class TestSelectMenu {
    private WebDriver driver;

    String url = "https://demo.automationtesting.in/Register.html";

    @BeforeClass
    public void setUp() {
        driver = Utils.getWebDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testSelectMenuByValue() {
        Utils.selectSelectByValue(driver, By.id("Skills"), "SQL");
    }

    @Test
    public void testSelectMenuByText() {
        Utils.selectSelectByText(driver, By.id("country"), "India");
    }

    @Test
    public void selectLanguage() {
        driver.findElement(By.id("msdd")).click();
        List<WebElement> languages = driver.findElements(By.cssSelector("a.ui-corner-all"));
        for (WebElement language : languages) {
            if (language.getText().equalsIgnoreCase("English") || language.getText().equalsIgnoreCase("Hindi")) {
                language.click();
            }
        }
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
