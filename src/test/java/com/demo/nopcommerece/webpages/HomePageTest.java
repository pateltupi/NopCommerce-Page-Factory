package com.demo.nopcommerece.webpages;
/*
 * Created By Trupti Patel on 2019-05-14
 */
import com.demo.nopcommerece.pageobject.HomePage;
import com.demo.nopcommerece.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {


    @Test
    public void userShouldexploreHomePageByHoverOnAllElements(){
        HomePage homePage = new HomePage();

        homePage.mouseHoverOnComputer();
        homePage.mouseHoverOnBooks();
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverOnApprealTopMenu();
        homePage.scrollDownHomePage(400);
        String actualtext = homePage.getHomeText();
        String expectedText = "Welcome to our store";
        Assert.assertEquals(actualtext,expectedText);
    }

}
