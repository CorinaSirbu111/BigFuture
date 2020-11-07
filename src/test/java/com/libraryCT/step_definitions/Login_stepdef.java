package com.libraryCT.step_definitions ;


import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Login_stepdef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriver driver = Driver.get();
        String url = ConfigurationReader.get("url");
        driver.get(url);


    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to log in and see the dashboard page")
    public void the_user_should_be_able_to_log_in_and_see_the_dashboard_page() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Library",actualTitle);


    }




}