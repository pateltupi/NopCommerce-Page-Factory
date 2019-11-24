package com.demo.nopcommerece.webpages;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.demo.nopcommerece.pageobject.HomePage;
import com.demo.nopcommerece.pageobject.RegisterPage;
import com.demo.nopcommerece.testbase.TestBase;
import com.demo.nopcommerece.utility.Util;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    @Test
    public void userShouldNavigateToRegistrationPage() throws InterruptedException {
        HomePage homePage = new HomePage();
        RegisterPage registerPage = new RegisterPage();
        Util util= new Util();
    /*
      Calling method to fill up registration detail
     */
        test = extent.createTest("Register Test");
        homePage.clickOnRegisterLink();
        String actualText = registerPage.DisplayedText();
        String expextedText = "Your Personal Details";
        Assert.assertEquals(actualText, expextedText);
        registerPage.clickgender();
        registerPage.enterTextToFirstname("Trupti");
        registerPage.enterTextToLastname("Patel");
        registerPage.selectDateFromDropDownList("8");
        registerPage.selectMonthFromDropDownList("February");
        registerPage.selectYearFromDropDownList("1985");
        //registerPage.enterTextToEmail(email); calling with variable
        registerPage.enterTextToEmail(registerPage.randomEmail());
        registerPage.enterTextToCompany("J&T Private ltd");
        registerPage.clickToNewsletter();
        registerPage.entertTextToPassword("abc1234");
        registerPage.enterTexttoConfirmPassword("abc1234");
        //registerPage.waitTillElementClickAbleRegisterButton();
        registerPage.clickOnRegisterButton();
        util.takeScreenShot();

    }

}
