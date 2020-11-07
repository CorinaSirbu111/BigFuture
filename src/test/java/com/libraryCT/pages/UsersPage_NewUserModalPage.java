package com.libraryCT.pages;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UsersPage_NewUserModalPage extends UsersPage {

    @FindBy(css = ".close")
    public WebElement exitmodalwindow;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullnamefield;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordfield;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailfield;

    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement startdatefield;
    @FindBy(xpath="//input[@name='end_date']")
    public WebElement enddatefield;
    @FindBy(id = "address")
    public WebElement addressfield;

    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement closebtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement savechangesbtn;

    @FindBy (id = "user_group_id")
    public WebElement usergroup;
    @FindBy(id ="status")
    public WebElement status;

    @FindBy(xpath = "//h5[@class=\"modal-title\"]")
    public WebElement modaltitle;


    public void SelectoptionsbyText(String dropdown, String choice) {
        WebElement select = Driver.get().findElement(By.id(dropdown));
        Select chooseptions = new Select(select);

        chooseptions.selectByVisibleText(choice);

    }
    public void SelectoptionsbyText(WebElement dropdown, String choice) {
        WebElement select = dropdown;
        Select chooseoptions = new Select(select);

        chooseoptions.selectByVisibleText(choice);

    }
    public void Selectoptionsbyindex(WebElement dropdown, int choice) {
        WebElement select = dropdown;
        Select chooseoptions = new Select(select);
        chooseoptions.selectByValue(choice+"");
        //chooseoptions.selectByIndex(choice);

    }
    public void Selectoptionsbyindex(String dropdown, int choice) {
        WebElement select = Driver.get().findElement(By.id(dropdown));
        Select chooseptions = new Select(select);

        chooseptions.selectByIndex(choice);

    }
    public void entertext(String text, WebElement field){
        BrowserUtils.waitForVisibility(field, 30);
        field.sendKeys(text);
    }
  public void enterfullname(String name){
        entertext(name, fullnamefield);
  }
public void enterpassword(String password){
        entertext(password, passwordfield);
}
public void enteremail(String email){
        entertext(email, emailfield);
}

public void SelectUsergroup(String option){
    BrowserUtils.waitFor(5);
    BrowserUtils.waitForVisibility(usergroup,10);
    SelectoptionsbyText(usergroup, option);

        BrowserUtils.waitFor(5);
}
    public void SelectStatus(String option){
        BrowserUtils.waitForVisibility(status,10);
        SelectoptionsbyText(status, option);
    }
    // takes integer and adds this to current date, calculating the desired days
    public String calculateDate(String i){
        int add = Integer.parseInt(i);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar caldendar = Calendar.getInstance();
        caldendar.add(Calendar.DAY_OF_MONTH,add);
        String Date = dateformat.format(caldendar.getTime());
        return Date;
    }
public void enterStartdate(String add){
        BrowserUtils.waitForVisibility(startdatefield, 50);
        startdatefield.clear();
    String Startdate =calculateDate(add);
    entertext(Startdate,startdatefield);
}
public void enterEnddate(String add){
        enddatefield.clear();
        String Enddate = calculateDate(add);
        entertext(Enddate, enddatefield);
}

public void enterAddress(String address){
        entertext(address,addressfield);
}
public void savechanges(){
        BrowserUtils.waitForClickablility(savechangesbtn,20);

        BrowserUtils.clickWithJS(savechangesbtn);
}

}




