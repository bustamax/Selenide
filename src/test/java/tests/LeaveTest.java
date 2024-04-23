package tests;

import com.codeborne.selenide.Condition;

import jdk.jfr.Description;
import org.testng.annotations.Test;


public class LeaveTest extends BaseTest{

    @Test
    public void myLeave() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.leavePage.leaveTab.click();
        app.leavePage.myLeave.click();
    }
    @Test
    public void leaveTabClick() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.leavePage.clickLeave.click();
        app.leavePage.shouldBeLeaveList.shouldBe(Condition.exactText("Leave List"));

    }

    @Test
    public void searchEmployeeName() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.leavePage.clickLeave.click();
        app.leavePage.userRoleDropDown.shouldBe(Condition.exactText("-- Select --"));
        app.leavePage.userRoleButton.click();
        app.leavePage.userRoleInput.shouldHave(Condition.exactText("Development"));
    }
}
