package com.parabank.tesCases;

import com.aventstack.extentreports.Status;
import com.parabank.base.BaseTest;
import com.parabank.pages.P01_Register;
import com.parabank.pages.P03_LandingPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;






public class T01_Register extends BaseTest
{

    SoftAssert softAssert= new SoftAssert();

    //verify that the user can't register with a password that contain space
    @Test
    public void register_NegativeScenario()
    {

        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("P0");

        // create object from landing page
        P03_LandingPage landingPage=new P03_LandingPage(driver);
        // create object from register page
        P01_Register registerPage=new P01_Register(driver);
        // test data
        String firstName="first";
        String lastName= "user";
        String address="Giza,Egypt";
        String city="Giza";
        String state="Egypt";
        String zipCode="112233";
        String phone="0103698524";
        String userName= "user2";
        String ssn="123456";
        String password="";
        String confirm="";




        landingPage.openRegisterPage();



        registerPage.getFirstNameField().sendKeys(firstName);
        registerPage.getLastNameField().sendKeys(lastName);
        registerPage.getAddressField().sendKeys(address);
        registerPage.getCityField().sendKeys(city);
        registerPage.getStateField().sendKeys(state);
        registerPage.getZipCodeField().sendKeys(zipCode);
        registerPage.getPhoneNumberField().sendKeys(phone);
        registerPage.getSsnField().sendKeys(ssn);
        registerPage.getUserNameField().sendKeys(userName);
        registerPage.getPasswordField().sendKeys(password);
        registerPage.getConfirmField().sendKeys(confirm);
        registerPage.SubmitRegisterForm();


        String actualError=registerPage.getPasswordError();
        String expectedError="Password is required.";
        softAssert.assertEquals(actualError,expectedError);
        softAssert.assertAll();

    }





    // Validate that user can register with valid data.
    @Test
    public void register_HappyScenario()
    {

        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("P0");

        // create object from landing page
        P03_LandingPage landingPage=new P03_LandingPage(driver);
        // create object from register page
        P01_Register registerPage=new P01_Register(driver);
        // test data
        String firstName="first";
        String lastName= "user";
        String address="Giza,Egypt";
        String city="Giza";
        String state="Egypt";
        String zipCode="112233";
        String phone="0103698524";
        String userName="user2";
        String ssn="123456";
        String password="Aa@12345";
        String confirm="Aa@12345";




        landingPage.openRegisterPage();



        registerPage.getFirstNameField().sendKeys(firstName);
        registerPage.getLastNameField().sendKeys(lastName);
        registerPage.getAddressField().sendKeys(address);
        registerPage.getCityField().sendKeys(city);
        registerPage.getStateField().sendKeys(state);
        registerPage.getZipCodeField().sendKeys(zipCode);
        registerPage.getPhoneNumberField().sendKeys(phone);
        registerPage.getSsnField().sendKeys(ssn);
        registerPage.getUserNameField().sendKeys(userName);
        registerPage.getPasswordField().sendKeys(password);
        registerPage.getConfirmField().sendKeys(confirm);
        registerPage.SubmitRegisterForm();



        String actualContactInformation=registerPage.getLoginMessage();
        softAssert.assertTrue(actualContactInformation.contains(userName));


        softAssert.assertAll();

    }


}
