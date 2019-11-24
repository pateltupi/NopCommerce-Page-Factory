package com.demo.nopcommerece.webpages;
/*
 * Created By Trupti Patel on 2019-05-13
 */
import com.demo.nopcommerece.pageobject.DeskTopPage;
import com.demo.nopcommerece.pageobject.HomePage;
import com.demo.nopcommerece.testbase.TestBase;
import com.demo.nopcommerece.utility.Util;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DeskTopTest extends TestBase {

    @Test
    public void userShouldBeAtDesktopPageandAbleToAddProductToCart() throws InterruptedException {

        HomePage homePage= new HomePage();
        DeskTopPage deskTopPage = new DeskTopPage();

        deskTopPage.mouseHoverOnComputerButton();
        deskTopPage.clickOnDesktopDropDownList();
        deskTopPage.clickOnSortBy();
        deskTopPage.selectVisiableTextFromSortByList("Name: Z to A");
        deskTopPage.scrollDown(600);
        deskTopPage.clickOnProductToViewDetails();
        deskTopPage.clickOnAddtoProductButton();
        String actualtext = deskTopPage.getPopUpText();
        String expectedtext ="The product has been added to your shopping cart";
        Assert.assertEquals(actualtext,expectedtext);
    }
}



