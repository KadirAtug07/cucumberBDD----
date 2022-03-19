package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.OrangeHRMHome;
import renastech.pages.OrangeHRMLogin;
import renastech.utils.BrowserUtils;

import java.util.Map;

public class OrangeHRMSteps {



    OrangeHRMHome orangeHRMHome=new OrangeHRMHome();

    @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {
        System.out.println("Browser is launched");

    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        OrangeHRMLogin orangeHRMLogin =new OrangeHRMLogin();
        orangeHRMLogin.setUsername();
        orangeHRMLogin.setPassword();




    }
    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {
        OrangeHRMLogin orangeHRMLogin =new OrangeHRMLogin();
        orangeHRMLogin.setLoginbutton();


    }
    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        OrangeHRMHome orangeHRMHome=new OrangeHRMHome();
        orangeHRMHome.setDashboardMessage();
    }
    @Then("The user wants to go to PIM page")
    public void the_user_wants_to_go_to_pim_page() {
        orangeHRMHome.setPIM();
    }
    @Then("The user wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page() {
      orangeHRMHome.setAddEmployee();


    }
    @Then("The user wants to add user name as {string}")
    public void the_user_wants_to_add_user_name_as(String name) {
        orangeHRMHome.setName(name);


    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String lastname) {
        orangeHRMHome.setLastName(lastname);


    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {
        orangeHRMHome.setSaveButton();


    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedHeader) {
        orangeHRMHome.setProfileHeader(expectedHeader);


    }

    @Then("The User wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page(Map<String,String> dataTable) {
        orangeHRMHome.setAddEmployee();
        orangeHRMHome.setName(dataTable.get("FirstName"));
        orangeHRMHome.setLastName(dataTable.get("LastName"));

    }
    @Then("The user wants to add login details")
    public void the_user_wants_to_add_login_details(Map<String,String> dataTable) {
        orangeHRMHome.setDetailsBox();
        orangeHRMHome.setName2(dataTable.get("User Name"));
        orangeHRMHome.setPassword(dataTable.get("Password"));
        orangeHRMHome.setRepassword(dataTable.get("Password"));
        orangeHRMHome.setStatus(dataTable.get("Status"));





    }
}
