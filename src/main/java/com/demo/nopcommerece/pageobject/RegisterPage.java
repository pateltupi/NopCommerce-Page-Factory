package com.demo.nopcommerece.pageobject;
/*
 * Created By Trupti Patel on 2019-05-14
 */

import com.demo.nopcommerece.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    //CREATING LOCATORS WITH FIND BY AND WEBELEMENT
    @FindBy(id="gender-male")
    WebElement _gender;
    @FindBy(id="FirstName")
    WebElement _firstName;

    @FindBy(id="LastName")
     WebElement _lastName;
    @FindBy(name="DateOfBirthDay")
     WebElement _DOB;
    @FindBy(name="DateOfBirthMonth")
    WebElement _month;
    @FindBy(name="DateOfBirthYear")
     WebElement _year;
    @FindBy (id="Email")
    WebElement _Email;
    @FindBy(id="Company")
     WebElement _Company;
    @FindBy (id="Newsletter")
    WebElement _newsletter;
    @FindBy(id="Password")
    WebElement _password;
    @FindBy (id="ConfirmPassword")
     WebElement _confirmPassword;
    @FindBy(id="register-button")
     WebElement _RegButton;
    @FindBy(xpath="//strong[contains(text(),'Your Personal Details')]")
    WebElement _Rtext;

//METHOD WITH LOG INFO AND WEBELEMENT
    public void clickgender(){
        log.info("Click on gender");
        clickonElement(_gender);
    }
    /*
    send text to first name
         */
    public String randomEmail() {
        return ("sam" + generateRandomNumber() + "@gmail.com");
    }
    public void enterTextToFirstname(String name){
        log.info("eEnter text to first name");
        sendTextToElement(_firstName,name);
    }
    /*
       Send Text to Lastname
     */
    public void enterTextToLastname(String last){
        log.info("Enter text to last name");
        sendTextToElement(_lastName,last);
    }
    /*
       Select date of birth from dropdown list
     */
    public void selectDateFromDropDownList(String date){
        log.info("Select date from dropdownlist");
        clickonElement(_DOB);
        selectVisibleTextFromDropDownMenu(_DOB,date);
    }
    /*
      select month of birth from dropdowm list
     */
    public void selectMonthFromDropDownList(String m){
        log.info("Select month from dropdown list");
        clickonElement(_month);
        selectVisibleTextFromDropDownMenu(_month,m);
    }
    /*
     select  year from dropdown list
     */
    public void selectYearFromDropDownList(String y){
        log.info("Select year from dropdownlist");
        clickonElement(_year);
        selectVisibleTextFromDropDownMenu(_year,y);
    }
    /*
    Entering Text to emailfield
     */
    public void enterTextToEmail(String email){
        log.info("Enter text to email");
        sendTextToElement(_Email,email);
    }
    /*
    Entering text to Comapny
     */
    public void enterTextToCompany(String com){
        log.info("Enter text to company");
        sendTextToElement(_Company,com);
    }
    /*
     Click on newsletter
     */
    public void clickToNewsletter(){
        log.info("Click to news letter");
        clickonElement(_newsletter);
    }
    /*
    entering text to password field
     */
    public void entertTextToPassword(String pass){
        log.info("Enter text to pasword");
        sendTextToElement(_password,pass);
    }
    /*
    entering text to confirmpassword
     */
    public void enterTexttoConfirmPassword(String confirm){
        log.info("Enter text to confirm Password");
        sendTextToElement(_confirmPassword,confirm);
    }
    /*
    clicking on register button
     */
    public void clickOnRegisterButton(){
        log.info("Click on register button");
        clickonElement(_RegButton);
    }
    public String DisplayedText(){
        log.info("display text");
        return getTextFromElement(_Rtext);
    }

}
