package tests;

import org.openqa.selenium.support.PageFactory;
import pages.loginPage;
import runner.TestRunner;

public class PageProvider {
    private static loginPage loginPage;

    public static loginPage getloginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, loginPage.class);
        }
        return loginPage;
    }
}
