package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_Login
{
    WebDriver driver;

    public P02_Login(WebDriver driver) {
        this.driver = driver;
    }

    By userNameLocator=By.cssSelector("input[name=\"username\"]");
    By passwordLocator=By.cssSelector("input[name=\"password\"]");
    By logInButtonLocator=By.cssSelector("div[class=\"login\"] input[type=\"submit\"]");

    public void enterUserName(String userName)
    {
        driver.findElement(userNameLocator).sendKeys(userName);
    }
    public void enterPassword(String password)
    {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickLoginInButton()
    {
        driver.findElement(logInButtonLocator).click();
    }


}
