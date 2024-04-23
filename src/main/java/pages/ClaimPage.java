package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ClaimPage extends BasePage{

    public SelenideElement claimButton = $(By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']"));

    public SelenideElement fromDateInput = $(By.xpath("(//div[@class='oxd-date-input'])[1]"));
    public SelenideElement toDateInput = $(By.xpath("(//div[@class='oxd-date-input'])[2]"));
    public SelenideElement fromMonthInput = $(By.xpath("//div[@class='oxd-calendar-selector-month-selected']"));
    public SelenideElement fromYearInput = $(By.xpath("//div[@class='oxd-calendar-selector-year-selected']"));
    public SelenideElement yearMonthSelector = $(By.xpath("//ul[@class='oxd-calendar-dropdown']"));

    public SelenideElement dayInput(String day){
        return $(By.xpath("//div/div[contains(text(), '"+day+"')]"));
    }
}
