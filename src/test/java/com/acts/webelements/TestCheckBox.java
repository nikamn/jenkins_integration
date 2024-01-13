package com.acts.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acts.utils.Utils;

public class TestCheckBox {

    private WebDriver driver;

    // String url =
    // "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
    String url = "https://demo.automationtesting.in/Register.html";

    @BeforeClass
    public void setUp() {
        driver = Utils.getWebDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void register() {
        // // WebElement label =
        // // driver.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']"));
        // // label.click();

        // By locator = null;
        // String value = "checkbox1";
        Utils.selectCheckBox(driver, By.cssSelector("input[type='checkbox']"), "checkbox1");
    }

    // @Test
    // public void testCheckBoxByName(){
    // By locator = null;
    // String value = "";
    // Utils.selectCheckBoxByName(driver, locator, value);

    // }

    // @Test
    // public void testAllCheckBoxes() {
    // List<WebElement> checkBoxes =
    // driver.findElements(By.name("RESULT_CheckBox-8"));

    // for (WebElement webElement : checkBoxes) {
    // String id = webElement.getAttribute("id");
    // driver.findElement(By.xpath("//label[@for='" + id + "']")).click();
    // }
    // }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
