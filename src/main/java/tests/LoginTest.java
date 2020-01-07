package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import runner.TestRunner;

public class LoginTest extends PageProvider {
    @Given("Open the website (.*)$")
    public void openWebsite(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("^I click on submit button$")
    public void clickSubmit() throws InterruptedException {
        getloginPage().clickSubmit();
        Thread.sleep(3000);
    }


    @Then("^I verify that I already in login page$")
    public void verifyadreadyloginpage() throws InterruptedException {
        getloginPage().verifyLoginSuccess("Đăng nhập");
        Thread.sleep(2000);
    }

    @When("^I type to email field the (.*)$")
    public void inputEmail(String email) throws InterruptedException {
        getloginPage().inputEmail(email);
        Thread.sleep(3000);
    }
}
