package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement userName;



    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }


}