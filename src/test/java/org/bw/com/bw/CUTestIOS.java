package com.bw;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.text.Element;
import java.net.URL;

public class CUTestIOS {

    public IOSDriver driver;

    @BeforeClass(alwaysRun=true)
    public void setUp() throws Exception {
        MutableCapabilities options = new XCUITestOptions();
        driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);
    }

    @AfterClass(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void cuTst() {

        driver.findElement(By.id("Sauce Labs Backpack")).click();
        driver.findElement(By.id("counter plus button")).click();
        driver.findElement(By.id("Add To Cart button")).click();
        driver.findElement(By.id("tab bar option cart")).click();
        driver.findElement(By.id("Proceed To Checkout button")).click();
        driver.findElement(By.id("Username input field")).clear();
        driver.findElement(By.id("Username input field")).click();
        driver.findElement(By.id("Username input field")).sendKeys("bob@example.com");
        driver.findElement(By.id("Password input field")).clear();
        driver.findElement(By.id("Password input field")).click();
        driver.findElement(By.id("Password input field")).sendKeys("10203040");
        driver.findElement(By.id("Login button")).click();
        driver.findElement(By.id("\t\n" +
                "Full Name* input field")).clear();
        driver.findElement(By.id("\t\n" +
                "Full Name* input field")).click();
        driver.findElement(By.id("\t\n" +
                "Full Name* input field")).sendKeys("My Name");
        driver.findElement(By.id("\t\n" +
                "Address Line 1* input field")).clear();
        driver.findElement(By.id("Address Line 1* input field")).click();
        driver.findElement(By.id("Address Line 1* input field")).sendKeys("Street 123");
        driver.findElement(By.id("\t\n" +
                "City* input field")).clear();
        driver.findElement(By.id("City* input field")).click();
        driver.findElement(By.id("City* input field")).sendKeys("New York");
        driver.findElement(By.id("Zip Code* input field")).clear();
        driver.findElement(By.id("Zip Code* input field")).click();
        driver.findElement(By.id("Zip Code* input field")).sendKeys("10001");
        driver.findElement(By.id("Country* input field")).clear();
        driver.findElement(By.id("Country* input field")).click();
        driver.findElement(By.id("Country* input field")).sendKeys("United States ");
        driver.findElement(By.id("To Payment button")).click();
        String pymntMethod = "Enter a payment method";
        String element = driver.findElement(By.id("Enter a payment method")).getText();
        Assert.assertEquals(element, pymntMethod);
        Assert.assertTrue(driver.findElement(By.id("Review Order button")).isDisplayed());

}
    }

