package com.demo.nopcommerece.pageobject;
/*
 * Created By Trupti Patel on 2019-05-14
 */

import com.demo.nopcommerece.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DeskTopPage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    WebElement _computer;

    @FindBy(xpath = ("//ul[@class='top-menu']//a[contains(text(),'Desktops')]"))
    WebElement _Desktop;
    @FindBy(xpath = "//div[@class='product-sorting']")
    WebElement _sortby;
    @FindBy(id = "products-orderby")
    WebElement _ztoa;
    @FindBy (xpath="//img[@title='Show details for Lenovo IdeaCentre 600 All-in-One PC']")
    WebElement _product;
    @FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
    WebElement _addToCart;
    @FindBy(className = "content")
    WebElement _popupText;

    /// Click on computer button
    public void mouseHoverOnComputerButton() {
        log.info("Mouse hover on Computer Button");
        mouseHoverToElement(_computer);
    }

    ///click on desktop form drowdown list
    public void clickOnDesktopDropDownList() {
        log.info("Click on Desktop from dropdown list");
        clickonElement(_Desktop);
    }

    //Click on sortBy list
    public void clickOnSortBy() {
        log.info("Click on sort by list");
        clickonElement(_sortby);
    }
   //sleecting text from drop down list
    public void selectVisiableTextFromSortByList(String z) {
        log.info("Select visiable text from dropdown list ");
        selectVisibleTextFromDropDownMenu(_ztoa, z);
    }
    //Clicking on product to view details
    public void clickOnProductToViewDetails() {
        log.info("Click on product to get information ");
        clickonElement(_product);
    }
    //Adding to cart  method
    public void clickOnAddtoProductButton() {
        log.info("Click on add to cart Button");
        clickonElement(_addToCart);
    }
     //Asset popup text with return type
    public String getPopUpText() {
        log.info("Assert popup text");
        return getTextFromElement(_popupText);
    }
    // scroldown method to page up down
    public void scrollDown(int scroll) {
        log.info("page is scrolling down");
        scrollUpDown(scroll);
    }
}

