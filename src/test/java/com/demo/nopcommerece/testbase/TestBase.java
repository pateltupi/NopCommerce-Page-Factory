package com.demo.nopcommerece.testbase;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.demo.nopcommerece.basepage.BasePage;
import com.demo.nopcommerece.browserselector.BrowserSelector;
import com.demo.nopcommerece.properties.LoadProperties;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestBase extends ExtentReport{

    /*
      to open url we make before
     */


    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperties loadProperties = new LoadProperties();

    String browser = loadProperties.getProperty("browser");
    String baseUrl = loadProperties.getProperty("baseUrl");

    @BeforeMethod
    public void setUp() {

        PropertyConfigurator.configure("/Users/surajbharmal/IdeaProjects/demo-nopcommerece-page-factory/src/test/java/com/demo/nopcommerece/resources/configfile/log4j.properties");
        browserSelector.selectBrowser(browser);
 //       System.out.println("----------BaseURL-----------"+baseUrl+"---------------------");
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}
