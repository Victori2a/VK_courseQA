import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SettingsPage {
    private final SelenideElement LANGUAGE = $(By.xpath("//*[contains(text(),'Язык')]"));
    private final SelenideElement ENGLISH_LANGUAGE = $(By.xpath("//a[@target='_self' and @class='sel-lang_i o' and text()='English']"));
    private final SelenideElement RESULT = $(By.xpath("//*[contains(text(),'Language')]"));
    public void changeLanguage(){
        Throwable exception = null;
        do {
            LANGUAGE.click();
            ENGLISH_LANGUAGE.shouldBe(visible).click();
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
}
