package com.acts.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acts.utils.Utils;

public class TableTest {

    private WebDriver driver;

    // String url = "https://demo.automationtesting.in/Register.html";
    String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
    @BeforeClass
    public void setUp() {
        driver = Utils.getWebDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void testTableCellData() {
        int rownum = 3;
        int colnum = 2;
        String exp = "Francisco Chang";

        WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + rownum + "]"
                + "/td[" + colnum + "]"));
        String act = cell.getText();
        Assert.assertEquals(act, exp);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
