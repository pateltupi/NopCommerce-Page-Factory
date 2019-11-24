package com.demo.nopcommerece.webpages;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.demo.nopcommerece.pageobject.*;
import com.demo.nopcommerece.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {


    @Test
    public void userShouldLogInSuccessfully() {
        HomePage homePage = new HomePage();
        LogInPage logInPage =new LogInPage();

        homePage.clickOnLogInLink();
        logInPage.enterTextToEmailField("s&w@gmail.com");
        logInPage.enterTextToPasswordField("abcd1234");
        logInPage.clickOnLogInButton();
    }

    @Test
    public void userShouldNavigateToRegistrationPage() {
        HomePage homePage = new HomePage();
        RegisterPage registerPage= new RegisterPage();

        homePage.clickOnRegisterLink();
        registerPage.clickgender();
        registerPage.enterTextToFirstname("Trupti");
        registerPage.enterTextToLastname("Patel");
        registerPage.selectDateFromDropDownList("8");
        registerPage.selectMonthFromDropDownList("February");
        registerPage.selectYearFromDropDownList("1985");
        registerPage.enterTextToEmail("");
        registerPage.enterTextToCompany("J&T Private ltd");
        registerPage.clickToNewsletter();
        registerPage.entertTextToPassword("abc1234");
        registerPage.enterTexttoConfirmPassword("abc1234");
        //registerPage.waitTillElementClickAbleRegisterButton();
        registerPage.clickOnRegisterButton();
    }
    @Test
    public void userShouldClickOnComputerAndMoveToPage () {
        HomePage homepage = new HomePage();
        ComputerPage computerPage = new ComputerPage();

        computerPage.clickOnComputerButton();
        String actualText = computerPage.getComputerText();
        String expextedText = "Computers";
        Assert.assertEquals(actualText, expextedText);
    }
    @Test
    public void userShouldBeAtDesktopPageandAbleToAddProductToCart() throws InterruptedException {
        HomePage homePage= new HomePage();
        DeskTopPage deskTopPage = new DeskTopPage();

        deskTopPage.mouseHoverOnComputerButton();
        deskTopPage.clickOnDesktopDropDownList();
        deskTopPage.clickOnSortBy();
        deskTopPage.selectVisiableTextFromSortByList("Name: Z to A");
        deskTopPage.scrollDown(600);
        deskTopPage.clickOnProductToViewDetails();
        deskTopPage.clickOnAddtoProductButton();
        //Thread.sleep(3000);
        String actualtext = deskTopPage.getPopUpText();
        String expectedtext ="The product has been added to your shopping cart";
        Assert.assertEquals(actualtext,expectedtext);

    }


}
