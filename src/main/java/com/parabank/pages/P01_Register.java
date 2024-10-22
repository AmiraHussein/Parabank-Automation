package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_Register
{
    WebDriver driver;

    // Constructor

    public P01_Register(WebDriver driver) {
        this.driver = driver;
    }

    // Elements locators

    By firstNameLocator =By.id("customer.firstName");
    By lastNameLocator=By.id("customer.lastName");
    By addressLocator=By.id("customer.address.street");
    By cityLocator=By.id("customer.address.city");
    By stateLocator=By.id("customer.address.state");
    By zipCodeLocator=By.id("customer.address.zipCode");
    By phoneLocator=By.id("customer.phoneNumber");
    By ssnLocator=By.id("customer.ssn");
    By userNameLocator=By.id("customer.username");
    By passwordLocator=By.id("customer.password");
    By confirmLocator=By.id("repeatedPassword");
    By registerButtonLocator =By.xpath("(//input[@type=\"submit\"])[2]");




    // Actions

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public WebElement getFirstNameField()
    {
        return driver.findElement(firstNameLocator);

    }
    public WebElement getLastNameField()
    {
        return driver.findElement(lastNameLocator);

    }
    public WebElement getAddressField()
    {
        return driver.findElement(addressLocator);

    }
    public WebElement getCityField()
    {
        return driver.findElement(cityLocator);

    }
    public WebElement getStateField()
    {
        return driver.findElement(stateLocator);

    }

    public WebElement getZipCodeField()
    {
        return driver.findElement(zipCodeLocator);

    }
    public WebElement getPhoneNumberField()
    {
        return driver.findElement(phoneLocator);

    }
    public WebElement getSsnField()
    {
        return driver.findElement(ssnLocator);

    }
    public WebElement getUserNameField()
    {
        return driver.findElement(userNameLocator);

    }
    public WebElement getPasswordField()
    {
        return driver.findElement(passwordLocator);

    }


    public WebElement getConfirmField()
    {
        return driver.findElement(confirmLocator);

    }




    public void SubmitRegisterForm()
    {
        driver.findElement(registerButtonLocator).click();
    }

    public String getLoggedInMessage()
    {
        return driver.findElement(By.linkText("Your account was created successfully. You are now logged in.")).getText();
    }

    public String getLoginMessage()
    {
        return driver.findElement(By.className("title")).getText();
    }
    public String getPasswordError()
    {
        return driver.findElement(By.id("customer.password.errors")).getText();
    }




}
