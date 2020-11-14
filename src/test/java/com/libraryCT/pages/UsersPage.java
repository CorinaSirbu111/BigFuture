package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UsersPage {

       public UsersPage() {
            PageFactory.initElements(Driver.get(), this);

        }
    @FindBy(id="user_status")
    public WebElement selectstatus;
        @FindBy (xpath ="//table[@id='tbl_users']/tbody/tr/td/a]")
            public List<WebElement> editbtns;

        @FindBy (xpath = "//a[contains(.,' Add User')]")
        public WebElement addUserbtn;

        public void checkUserExist(String Name){
            String nameXpath = "//*[@id=\"tbl_users\"]/tbody/tr/td[3][text()='"+Name+"']";
            BrowserUtils.waitForVisibility(By.xpath(nameXpath),20);
            WebElement nameElement = Driver.get().findElement(By.xpath(nameXpath));
            Assert.assertTrue(nameElement.isDisplayed());

        }

        public String getIdOfName(String name){
            String idXpath = "//table[@id='tbl_users']//td[text()='"+name+"']/../td[2]";
            BrowserUtils.waitForVisibility(By.xpath(idXpath),50);
            WebElement idElement = Driver.get().findElement(By.xpath(idXpath));
            return idElement.getText();
        }

        public void editUser(String name){
            String nameXpath = "//table[@id='tbl_users']//td[text()='"+name+"']/../td[1]";
            BrowserUtils.waitForVisibility(By.xpath(nameXpath),20);
            WebElement nameElement = Driver.get().findElement(By.xpath(nameXpath));
            BrowserUtils.waitForClickablility(nameElement,5);
            nameElement.click();

        }
        public void selectstatus(String choice){
    BrowserUtils.waitForVisibility(selectstatus,30);
            WebElement select = selectstatus;
            Select chooseoptions = new Select(select);
            chooseoptions.selectByVisibleText(choice);
            BrowserUtils.waitFor(1);


        }
    }

