package com.demo.nopcommerece.utility;
/*
 * Created By Trupti Patel on 2019-05-14
 */

import com.demo.nopcommerece.basepage.BasePage;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {

    public void clickonElement(WebElement element) {
        element.click();
    }

    /**
     * This method will generate random number
     *
     * @return
     */
    public int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);
    }

    /*
      Send text to element
    */
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    /*
    This mehtod is for select visible text from drop down menu
     */
    public void selectVisibleTextFromDropDownMenu(WebElement element, String text) {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }

    /*
    this method is for select by value from drop down Menu
     */
    public void selectByValueFromDropDownMenu(WebElement element, String value) {
        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }

    /*
    This method is for select by Index from drop down Menu
     */
    public void selectByIndexFromDropDownMenu(WebElement element, int index) {
        Select dropDown = new Select(element);
        dropDown.selectByIndex(index);
    }

    /*
    This method is for Action by mouseHover
     */
    public void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    /*
    This method is for mouse hover to element
     */
    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    /*This is mehtod for click and drag
     */
    public void clickAndHoldToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }

    /*This is for click and drag with By by
     */
    public void clickAndHoldElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }

    /* This is for drag and drop with webelemen

     */
    public void dropAndDragElement(WebElement fromElement, WebElement toElement) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
    }

    /*This is the actions class swithching frame from one side to another side
     */
    public void dragAndDropElement(WebElement element) {
        Actions actions = new Actions(driver);
        driver.switchTo().frame(0);
    }

    //method to scroll page up
    public void scrollUpDown(int i) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + i + ")");
    }

    //Reture type method  to get text
    public String getTextFromElement(WebElement element) {
        return (element).getText();
    }
    public boolean verifyThatElementIsDisplayed(WebElement element) {

        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * This method will generate random string
     * @param length
     * @return
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method will take screen shot
     */
    public void takeScreenShot() {
        String filePath = System.getProperty("user.dir")+"/src/main/java/com/demo/nopcommerece/screenshot";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void takeFileNameScreenShot(String filenname){
        //save in string to get property path(from screenshot package)
        String filePath = System.getProperty("user.dir")+"/src/main/java/com/demo/nopcommerece/screenshot";
        //TakeScreenShot is predifine packagescreenshot is obj and driver photo in take
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        //file is prepackage from io, useing objscreenshot to act taking screenshot
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(scr1, new File(filePath + filenname + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

