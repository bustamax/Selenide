package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends BasePage{


    /**
     * Проверка поиска кнопки Admin
     */
    public SelenideElement searchTab = $(By.xpath("//input[@class='oxd-input oxd-input--active']"));
    public SelenideElement adminButton = $(By.xpath("//a[@class='oxd-main-menu-item']"));


    /**
     * Проверка выпадающего меню
     */


    public SelenideElement menuJob = $(By.xpath( "(//nav[@role='navigation'])[2]/ul/li[2]"));


    /**
     *   Поиск пользователя
     */


    public SelenideElement usernameSearchInput =  $(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters'])[1]/div/div/input"));
    public SelenideElement userRoleButton = $(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
    public SelenideElement userRoleDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));

    public SelenideElement userStatusButton = $(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
    public SelenideElement userStatusDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    //таблица поиска
    public SelenideElement resultTable = $(By.xpath("//div[@class='oxd-table']"));

    public void setUsernameSearchInput(String username) {
        usernameSearchInput.setValue(username);
        usernameSearchInput.shouldHave(Condition.exactValue(username));
    }
    public void setUserRole(String role){
        userRoleButton.click();
        userRoleDropDown.getWrappedElement().findElement(byText(role)).click();
    }

    public void setUserStatus(String status){
        userStatusButton.click();
        userStatusDropDown.getWrappedElement().findElement(byText(status)).click();

    }




     /**
     *   Добавление нового пользователя
     */
    public SelenideElement addButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    //Выпадающий список роли в форме
    //   public SelenideElement userRole = $(By.xpath("//div[@class='oxd-select-wrapper']"));
    //  public SelenideElement selectRole =$(By.xpath("//div[@role='listbox']/div[3]"));

    //Выпадающий список статуса в форме
    public SelenideElement userStatus = $(By.xpath("(//div[@class='oxd-select-wrapper'])[2]"));
    public SelenideElement selectStatus =$(By.xpath("//div[@role='listbox']/div[2]"));

    //Выбор работника из списка
    //public SelenideElement employeeName = $(By.xpath("//div[@class='oxd-autocomplete-wrapper']"));
    public SelenideElement employeeNameInput = $(By.xpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement selectemployeeName =$(By.xpath("//div[@role='listbox']/div[1]"));
    //Ввод имени пользователя в форме
    public SelenideElement usernameInput = $(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[4]/div/input"));
    //Ввод пароля и подтверждения в форме
    public SelenideElement passwInput = $(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]/div/input"));
    public SelenideElement passwConfirmInput = $(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[6]/div/input"));
    //Кнопки сохранить и отмена
    public SelenideElement saveButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement cancelButton = $(By.xpath("//button[@type='button']"));

    //вводим имя
    public void setEmployeeNameInput(String name){
        employeeNameInput.setValue(name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        selectemployeeName.click();
    }

    public void setUsernameInput(String username){
        usernameInput.setValue(username);
        usernameInput.shouldHave(Condition.exactValue(username));
    }

    public void setPasswInput(String password){
        passwInput.setValue(password);
        passwInput.shouldHave(Condition.exactValue(password));
    }

    public void setPasswConfirmInput(String password){
        passwConfirmInput.setValue(password);
        passwConfirmInput.shouldHave(Condition.exactValue(password));
    }
}
