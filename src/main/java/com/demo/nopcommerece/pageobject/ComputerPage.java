package com.demo.nopcommerece.pageobject;
/*
 * Created By Trupti Patel on 2019-05-14
 */

import com.demo.nopcommerece.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ComputerPage extends Util {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
//Creting method @find BY with webelement
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    WebElement _computer;

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement _computerText;

    public void clickOnComputerButton() {
        log.info("Click on Computer Button");
        clickonElement(_computer);
    }

    public String getComputerText() {
        log.info("Get Computer text");
        return getTextFromElement(_computerText);
    }
}

