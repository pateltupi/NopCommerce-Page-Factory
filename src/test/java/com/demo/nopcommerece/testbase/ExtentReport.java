package com.demo.nopcommerece.testbase;
/*
 * Created By Trupti Patel on 2019-11-18
 */

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.demo.nopcommerece.basepage.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ExtentReport extends BasePage {

    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeTest
    public void extentReportSetup() {
        //location of the extent report // /Users/surajbharmal/IdeaProjects/demo-nopcommerece-page-factory
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/src/main/java/com/demo/nopcommerece/extentReport/myReport.html");
        extent = new ExtentReports();  //create object of ExtentReports
        extent.attachReporter(htmlReporter);

        htmlReporter.config().setDocumentTitle("Automation Report"); // Tittle of Report
        htmlReporter.config().setReportName("Extent Report V4"); // Name of the report
        htmlReporter.config().setTheme(Theme.DARK);//Default Theme of Report

        // General information releated to application
        extent.setSystemInfo("Application Name", "Google Test");
        extent.setSystemInfo("User Name", "Ankur Jain");
        extent.setSystemInfo("Envirnoment", "Production");
    }

    @AfterTest
    public void endReport() {
        extent.flush();
    }

}
