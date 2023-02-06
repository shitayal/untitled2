package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
public class NewTest {
    private WebDriver driver;
    @Test
    public void testEasy() {
        System.out.println("I am one");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("I am two");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("I am three");
    }
}
