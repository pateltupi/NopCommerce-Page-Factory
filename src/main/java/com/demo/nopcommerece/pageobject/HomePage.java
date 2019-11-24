package com.demo.nopcommerece.pageobject;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.demo.nopcommerece.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage  extends Util {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //creting findby element for login link
    @FindBy(linkText = "Log in")
    WebElement _logInLink;

    //creating /@find by   element for register
    @FindBy(linkText = "Register")
    WebElement _registerLink;

    //creating @find by element for electronic with xpath
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
    WebElement _Electronics;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
     WebElement _computer;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
    WebElement _Books;

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Apparel')]")
     WebElement _Apparel;

    @FindBy (xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _homeText;
    //click on log in link
    public void clickOnLogInLink(){
    log.info("Click on LoginLink");
    clickonElement(_logInLink);
    }
    public void clickOnRegisterLink(){
    log.info("Click on Registration Link");
    clickonElement(_registerLink);
    }
    public void mouseHoverOnComputer(){
        log.info("Mouse hover on Computer");
        mouseHoverToElement(_computer);
    }
    public void mouseHoverOnElectronics(){
        log.info("Mouse hover on Electronics");
        mouseHoverToElement(_Electronics);
    }
    public void mouseHoverOnBooks(){
       log.info("Mouse hover on Books");
        mouseHoverToElement(_Books);
    }
    public void mouseHoverOnApprealTopMenu(){
    log.info("Mouse hover on Apparel");
    mouseHoverToElement(_Apparel);
    }
    public String getHomeText(){
        return getTextFromElement(_homeText);
    }
    public void scrollDownHomePage(int h){
        scrollUpDown(h);
    }
}

