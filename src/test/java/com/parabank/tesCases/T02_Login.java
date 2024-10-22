package com.parabank.tesCases;

import com.aventstack.extentreports.Status;
import com.parabank.base.BaseTest;
import com.parabank.pages.P01_Register;
import com.parabank.pages.P02_Login;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class T02_Login extends BaseTest
{



    SoftAssert softAssert=new SoftAssert();

    @Test
    public void login_HappyScenario()  {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("P0");


        P01_Register register=new P01_Register(driver);
        P02_Login login = new P02_Login(driver);

        //test data
        String userName="user2";
        String password="Aa@12345";

        login.enterUserName(userName);
        login.enterPassword(password);
        login.clickLoginInButton();


        String actualText=register.getLoginMessage();
        String expectedText="Accounts Overview";
        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();






    }

}
