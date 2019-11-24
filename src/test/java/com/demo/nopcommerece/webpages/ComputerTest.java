package com.demo.nopcommerece.webpages;
/*
 * Created By Trupti Patel on 2019-05-13
 */

import com.demo.nopcommerece.pageobject.ComputerPage;
import com.demo.nopcommerece.pageobject.HomePage;
import com.demo.nopcommerece.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {


    @Test
    public void userShouldClickOnComputerAndMoveToPage() {
        HomePage homepage = new HomePage();
        ComputerPage computerPage = new ComputerPage();

        computerPage.clickOnComputerButton();
        String actualText = computerPage.getComputerText();
        String expextedText = "Computers";
        Assert.assertEquals(actualText, expextedText);
    }
}

