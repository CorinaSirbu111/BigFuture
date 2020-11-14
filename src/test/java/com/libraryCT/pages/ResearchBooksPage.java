package com.libraryCT.pages;

import com.libraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResearchBooksPage {

    public ResearchBooksPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(css = "#inputEmail")
    public WebElement email;

    @FindBy(css = "#inputEmail")
    public WebElement email2;


}
