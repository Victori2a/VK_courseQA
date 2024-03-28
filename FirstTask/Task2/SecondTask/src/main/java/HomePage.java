import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public final SelenideElement USERNAME = $(By.xpath("//h1[@class='__user-profile-name-decorator']"));
    private final SelenideElement TOP_PANEL = $(By.xpath("//button[@aria-label='Настройки профиля']"));
    private final SelenideElement PHOTO_AVATAR = $(By.xpath("//div[@id='hook_Block_Avatar']"));
    private final SelenideElement SETTINGS = $(By.xpath("//a[@class='u-menu_a ' and @href = '/settings']"));
    private final SelenideElement FRIENDS_ELEMENT = $(By.xpath("//button[@aria-label='Друзья']"));
    private final SelenideElement EXIT_BLOCK = $(By.xpath("//div[@role='listitem']"));
    private final SelenideElement FIRST_EXIT_BUTTON = $(By.xpath("//a[contains(text(),'Выйти')]"));
    private final SelenideElement SECOND_EXIT_BUTTON = $(By.xpath("//input[@data-l='t,logout']"));
    public void pressOnSettings() {
        SETTINGS.click();
    }
    public void clickOnFriends(){
        FRIENDS_ELEMENT.click();
    }
    public void exit(){
        TOP_PANEL.click();
        EXIT_BLOCK.click();
        FIRST_EXIT_BUTTON.isDisplayed();
        FIRST_EXIT_BUTTON.click();
        SECOND_EXIT_BUTTON.isDisplayed();
        SECOND_EXIT_BUTTON.click();
    }

}
