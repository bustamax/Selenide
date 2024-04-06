package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class BuzzTest extends BaseTest{

    @Test
    public void buzzPostTest() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        //Проверка отправки поста

        //Клик по кнопке Admin
        app.buzzPage.buzzButton.click();

        app.buzzPage.tetxArea.setValue("test");

        app.buzzPage.postButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
