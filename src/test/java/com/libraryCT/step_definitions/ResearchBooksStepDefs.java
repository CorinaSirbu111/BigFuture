package com.libraryCT.step_definitions;

import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ResearchBooksStepDefs {
    @Then("the user should be able to log in and see the dashboard page")
    public void the_user_should_be_able_to_log_in_and_see_the_dashboard_page() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Library",actualTitle);
    }
}
