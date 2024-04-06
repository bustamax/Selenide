package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AdminTest extends BaseTest {

    /**
     *  Проверка поиска - фильтруем кнопку Admin
     */
    @Test
    public void searchAdminTest() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        app.adminPage.searchTab.setValue("Admin");
        app.adminPage.searchTab.shouldHave(Condition.exactValue("Admin"));

    }

    /**
     *   Проверка работы меню в панели Admin
     */
    @Test
    public void menuJobCheck() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        //Клик по кнопке Admin
        app.adminPage.adminButton.click();
        //Проверка меню
        app.adminPage.menuJob.click();
        app.adminPage.menuJob.getWrappedElement().findElement(byText("Job Titles")).click();
        //Возврат в Admin
        back();

        app.adminPage.menuJob.click();
        app.adminPage.menuJob.getWrappedElement().findElement(byText("Pay Grades")).click();
        back();

        app.adminPage.menuJob.click();
        app.adminPage.menuJob.getWrappedElement().findElement(byText("Employment Status")).click();
        back();

        app.adminPage.menuJob.click();
        app.adminPage.menuJob.getWrappedElement().findElement(byText("Job Categories")).click();
        back();

        app.adminPage.menuJob.click();
        app.adminPage.menuJob.getWrappedElement().findElement(byText("Work Shifts")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *   Проверка поиска пользователя в панели Admin
     */
    @Test
    public void searchUserTest() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        //Клик по кнопке Admin
        app.adminPage.adminButton.click();

        //Заполняем параметры поиска
        app.adminPage.setUsernameSearchInput("Admin");

        app.adminPage.setUserRole("Admin");

        app.adminPage.setUserStatus("Enabled");
        //Кликаем поиск
        app.adminPage.saveButton.click();
        //Проверяем в результатах поиска нужного пользователя
        app.adminPage.resultTable.findElement(byText("Admin"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *   Проверка добавления нового пользователя
     */
    @Test
    public void addUserTest() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        //Клик по кнопке Admin
        app.adminPage.adminButton.click();

        //Клик по кнопке Add - для добавления пользователя
        app.adminPage.addButton.click();
        //Открыта форма заполнения полей нового пользователя

        //Выбор из выпавшего списка ролей (Select, Admin, ESS) третьего значения ESS
        //Используется метод из SearchUser
        app.adminPage.setUserRole("ESS");

        //Выбор из выпавшего списка статусов (Select, Enabled, Disabled) первого значения Enabled
        //используется метод из SearchUser
        app.adminPage.setUserStatus("Enabled");

        app.adminPage.setEmployeeNameInput("Bob");

        app.adminPage.setUsernameInput("Testsov");

        app.adminPage.setPasswInput("123456qwe");

        app.adminPage.setPasswConfirmInput("123456qwe");

        app.adminPage.saveButton.click();

        try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
