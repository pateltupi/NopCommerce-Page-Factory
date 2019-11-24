package com.demo.nopcommerece.browserselector;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.demo.nopcommerece.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends BasePage {

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/com/demo/nopcommerece/resources/driver/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/java/com/demo/nopcommerece/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        } //else if (browser.equalsIgnoreCase("ie")) {
        // System.setProperty("webdriver.ie.driver", "resources\\drivers\\IEDriverServer.exe");
        // driver = new InternetExplorerDriver();
        //}
        else {
            System.out.println("Wrong Browser Selected");
        }
    }
}

