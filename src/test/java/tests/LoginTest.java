package tests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentials() {
        app.loginPage.login("Admin","admin123");
    }

    @Test
    public void loginWithInvalidCredentials() {
        app.loginPage.login("sjfksdf","admin123");
    }

}
