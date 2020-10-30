package com.libraryCT.pages;

import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(css = "#inputEmail")
    public WebElement email;
    @FindBy(id = "inputPassword")
    public WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    public WebElement signIn;


    public void login(String username, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        email.sendKeys(username);
        this.password.sendKeys(password);
        signIn.click();


    }
}