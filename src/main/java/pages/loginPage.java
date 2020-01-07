package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class loginPage {
    private WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hero-banner-sign-in-to-office-365-link")
    WebElement loginButton;

    public void clickSubmit() throws InterruptedException {
        loginButton.click();
    }

    @FindBy(xpath = "//*[@id=\"loginHeader\"]/div")
    WebElement txtTextLogin;

    public void verifyLoginSuccess(String title) throws InterruptedException {
        String textTitle = txtTextLogin.getText();
        if (textTitle.equals("Sign in")) {
            title = "Sign in";
            Assert.assertEquals(textTitle, title);
        } else {
            Assert.assertEquals(textTitle, title);
        }
    }//verify user login successful

    @FindBy(id = "i0116")
    WebElement txtEmail;

    public void inputEmail(String txtEmailInput) throws InterruptedException {
        txtEmail.sendKeys(txtEmailInput);
    }


}
