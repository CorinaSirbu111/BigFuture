package com.libraryCT.step_definitions;

import com.libraryCT.pages.DashboardPage;
import com.libraryCT.pages.LoginPage;
import com.libraryCT.pages.UsersPage;
import com.libraryCT.pages.UsersPage_NewUserModalPage;
import com.libraryCT.utilities.BrowserUtils;
import com.libraryCT.utilities.ConfigurationReader;
import com.libraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LibrarianaddsnewUsertoUserPage_stepdef {

    LoginPage login = new LoginPage();
    DashboardPage dash = new DashboardPage();
    UsersPage usersPage = new UsersPage();
    UsersPage_NewUserModalPage addNewUserModalPage = new UsersPage_NewUserModalPage();
    String name;
    String ID;

    @Given("librarian is logged in")
    public void librarian_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions

        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("librarian");
        String password = ConfigurationReader.get("password");
        login.login(username, password);
        BrowserUtils.waitFor(4);
    }

    @Given("librarian goes to the Users Page")
    public void librarian_goes_to_the_Users_Page() {

        BrowserUtils.waitForVisibility(dash.UsersPagebtn, 60);
        dash.UsersPagebtn.click();
    }

    @When("librarian clicks on add new user button.")
    public void librarian_clicks_on_add_new_user_button() {
        // Write code here that turns the phrase above into concrete actions

        BrowserUtils.waitForVisibility(usersPage.addUserbtn, 30);
        usersPage.addUserbtn.click();
    }

    @Then("librarian clicks on close button.")
    public void librarian_clicks_on_close_button() {
        // Write code here that turns the phrase above into concrete actions
        BrowserUtils.waitForVisibility(addNewUserModalPage.closebtn, 90);
        addNewUserModalPage.closebtn.click();
    }

    @Then("librarian is on Users Page.")
    public void librarian_is_on_Users_Page() {
        // Write code here that turns the phrase above into concrete actions

        BrowserUtils.waitFor(6);

        Assert.assertFalse(addNewUserModalPage.modaltitle.isDisplayed());
    }

    @Then("librarian enters the following information into the fields:")
    public void librarian_enters_the_following_information_into_the_fields(Map<String, String> list) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.//
        // For other transformations you can register a DataTableType.
        //

        addNewUserModalPage.enterfullname(list.get("fullname"));
        this.name = list.get("fullname");
        addNewUserModalPage.enterpassword(list.get("password"));
        String email = Math.random() * 99000 + (list.get("email"));
        addNewUserModalPage.enteremail(email);
        addNewUserModalPage.SelectUsergroup(list.get("usergroup"));
        addNewUserModalPage.SelectStatus(list.get("status"));
        addNewUserModalPage.enterStartdate((list.get("Start date")));
        addNewUserModalPage.enterEnddate(list.get("End date"));
        addNewUserModalPage.enterAddress(list.get("Address"));


    }


    @Then("librarian clicks on save changes button.")
    public void librarian_clicks_on_save_changes_button() {
        // Write code here that turns the phrase above into concrete actions
        addNewUserModalPage.savechanges();
    }

    @When("librarian  sees newly created useraccount.")
    public void librarian_sees_newly_created_useraccount() {
        // Write code here that turns the phrase above into concrete actions
        this.ID = usersPage.getIdOfName(name);
        usersPage.checkUserExist(name);
    }

    @Then("librarian  clicks on edituser button.")
    public void librarian_clicks_on_edituser_button() {
        // Write code here that turns the phrase above into concrete actions
        usersPage.editUser(name);
    }

    @Then("librarian changes status to {string}")
    public void librarian_changes_status_to(String string) {
        // Write code here that turns the phrase above into concrete actions

        addNewUserModalPage.SelectStatus(string);
        addNewUserModalPage.savechanges();
    }


    @Then("useraccount  has been changed to {string}.")
    public void useraccount_has_been_changed_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        usersPage.selectstatus(string);
        Driver.get().navigate().refresh();
        usersPage.selectstatus(string);
        usersPage.checkUserExist(name);

    }


}
