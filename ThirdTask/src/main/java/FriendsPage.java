import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FriendsPage {
    private final SelenideElement PERSON = $(By.xpath("//span[@data-l='t,e2' and @class='o']]"));
    private final SelenideElement ADD_FRIEND = $(By.xpath("//a[@aria-label='Добавить в друзья']"));
    private final SelenideElement RESULT = $(By.xpath("//button[contains(text(),'Запрос отправлен')]"));
    private final SelenideElement CANCEL_ADDITION = $(By.xpath("//a[contains(text(),'Отменить запрос')]"));
    public void addFriend() {
        Throwable exception = null;
        do {
            PERSON.click();
            ADD_FRIEND.shouldBe(visible).click();
            try {
                getResult();
                exception = null;
            } catch (Throwable e){
                exception = e;
            }
        } while(exception!=null);
    }
    public String getResult() {
        return RESULT.shouldBe(visible).innerText();
    }
    public void cancelFriendship() {
        RESULT.click();
        CANCEL_ADDITION.click();
    }
}
