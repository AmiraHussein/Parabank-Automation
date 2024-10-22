package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class P03_LandingPage
{
    WebDriver driver;
    By registerLinkLocator = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a\n");




    public P03_LandingPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void openRegisterPage()
    {
        driver.findElement(registerLinkLocator).click();

    }








}
