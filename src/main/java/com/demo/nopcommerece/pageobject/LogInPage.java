package com.demo.nopcommerece.pageobject;
/*
 * Created By Trupti Patel on 2019-05-14
 */

import com.demo.nopcommerece.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends Util {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    //CRETING LOCATION WITH FINDBY WITH WEBELEMENT
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeText;

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(name = "Password")
    WebElement _passwordField;
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement _loginBtn;


    /*
    send text to email field
     */

    public void enterTextToEmailField(String email) {
        log.info("Enter text to email filed ");
        sendTextToElement(_emailField, email);
    }

    /*
    Send text to password
     */
    public void enterTextToPasswordField(String password) {
        log.info("Enter text to password fiels");
        sendTextToElement(_passwordField, password);
    }

    /*
    Click on loginButton
     */
    public void clickOnLogInButton() {
        log.info("Click on log in button");
        clickonElement(_loginBtn);
    }

    public String getWelcomeText() {
        log.info("Get text for assert");
        return getTextFromElement(_welcomeText);
    }


}



