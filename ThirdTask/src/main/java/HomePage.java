import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement FRIENDS_ELEMENT = $(By.xpath("//button[@aria-label='Друзья']"));
    private final SelenideElement TOP_PANEL = $(By.xpath(".//*[@data-l='t,navigationToolbar']"));
    private final SelenideElement MESSAGE = $(By.xpath(".//*[contains(@class,'toolbar_nav_a')]"));
    private final SelenideElement HOBBIES = $(By.xpath(".//div[ contains(text(), 'Увлечения')]"));
    private final SelenideElement PROFILE_SETTINGS = $(By.xpath("//button[@aria-label='Настройки профиля']"));
    private final SelenideElement LOGOUT_BUTTON = $(By.xpath(".//*[@class='toolbar_accounts-user-delete-button']"));
    private final SelenideElement FINAL_LOGOUT_BUTTON = $(By.xpath(".//input[@data-l='t,logout']"));
    private final SelenideElement MOMENTS_BUTTON = $(By.xpath("//button[@data-l='t,to_moments']"));
    public HomePage() {
        checkHomePage();
    }
    public void checkHomePage() {
        TOP_PANEL.shouldBe(visible);
        FRIENDS_ELEMENT.shouldBe(visible);
        MESSAGE.shouldBe(visible);
        HOBBIES.shouldBe(visible);
    }
    public void logOut() {
        PROFILE_SETTINGS.click();
        LOGOUT_BUTTON.click();
        FINAL_LOGOUT_BUTTON.click();
    }
    public boolean checkMoment() {
        return (($(byText("Моменты")).exists()) ? true : false);
    }
    public FriendsPage clickOnFriends(){
        return new FriendsPage();
    }
}
