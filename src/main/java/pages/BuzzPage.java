package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BuzzPage extends BasePage{

    /**
     * Проверка публикации поста в панели Buzz
     */

    //Кнопка в основном меню
    public SelenideElement buzzButton = $(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']"));
    //Поле ввода текста поста
    public SelenideElement tetxArea = $(By.xpath("//textarea[@class='oxd-buzz-post-input']"));
    //Кнопка отправки поста
    public SelenideElement postButton = $(By.xpath("//button[@type='submit']"));
}
