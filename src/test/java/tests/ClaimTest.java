package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;

public class ClaimTest extends BaseTest{
    @Test
    public void calendarTest() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        app.claimPage.claimButton.click();
        //Клик по форме ввода даты FromDate
        app.claimPage.fromDateInput.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //выбираю месяц
        app.claimPage.fromMonthInput.click();
        app.claimPage.yearMonthSelector.findElement(byText("May")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Выбираю год
        app.claimPage.fromYearInput.click();
        app.claimPage.yearMonthSelector.findElement(byText("1999")).click();
        //Выбираю день
        app.claimPage.dayInput("19").click();
        //проверяю
      //  claimPage.fromDateInput.shouldHave(Condition.exactText("1999-19-05"), Duration.ofSeconds(2));
      
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void calendarSecondTest() {
        //Авторизация
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        app.claimPage.claimButton.click();
        //Клик по форме ввода даты FromDate
        app.claimPage.toDateInput.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //выбираю месяц
        app.claimPage.fromMonthInput.click();
        app.claimPage.yearMonthSelector.findElement(byText("May")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Выбираю год
        app.claimPage.fromYearInput.click();
        app.claimPage.yearMonthSelector.findElement(byText("2003")).click();
        //Выбираю день
        app.claimPage.dayInput("19").click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
