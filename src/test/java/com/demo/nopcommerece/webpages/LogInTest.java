package com.demo.nopcommerece.webpages;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.demo.nopcommerece.pageobject.*;
import com.demo.nopcommerece.testbase.TestBase;
import com.demo.nopcommerece.utility.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

//HERE WE R EXTENDING CLASS WITH TESTBASE TO OPEN URL AND CLOSE BROWSER
public class LogInTest extends TestBase {
    @Test
    public void userShoudNavigateToLogInSuccessfully() {
        HomePage homePage = new HomePage();
        LogInPage logInPage = new LogInPage();

//
        homePage.clickOnLogInLink();
        String actualText = logInPage.getWelcomeText();
        String expextedText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualText, expextedText);
    }

    @Test
    //Entering email and password to log in
    public void userShouldLogInSuccessfully() {


       test = extent.createTest("Login Test");
        HomePage homePage = new HomePage();
        LogInPage logInPage = new LogInPage();
        Util util =  new Util();

        homePage.clickOnLogInLink();
        logInPage.enterTextToEmailField("s&w@gmail.com");
        logInPage.enterTextToPasswordField("abcd1234");
        logInPage.clickOnLogInButton();
         util.takeFileNameScreenShot("LogIn");
    }

}


