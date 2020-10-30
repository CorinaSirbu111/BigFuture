package com.libraryCT.step_definitions;

import com.libraryCT.pages.LoginPage;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @When("the user login as a {string} {string}")
    public void the_user_login_as_a(String username , String password) {
        new LoginPage().login(username, password);



    }

    @Then("the user on  {string}")
    public void the_user_on(String string) {

    }

    @Then("the user should logout")
    public void the_user_should_logout() {

    }



}
