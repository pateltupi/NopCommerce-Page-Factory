package com.demo.nopcommerece.basepage;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage  {
    public static WebDriver driver;
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}

