import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private SelenideElement LOGIN_FIELD = $(By.xpath("//input[@name='st.email']"));
    private SelenideElement PASSWORD_FIELD = $(By.xpath("//input[@name='st.password']"));
    private SelenideElement LOGIN_BUTTON = $(By.xpath("//input[@class = 'button-pro __wide'"));

    public LoginPage(String url) {
        open(url);
        LOGIN_FIELD.shouldBe(visible);
        PASSWORD_FIELD.shouldBe(visible);
        LOGIN_BUTTON.shouldBe(visible);
    }

    public void enterLogin(String login) {
        LOGIN_FIELD.setValue(login);
    }

    public void enterPassword(String password) {
        PASSWORD_FIELD.setValue(password);
    }

    public void clickLoginButton() {
        LOGIN_BUTTON.click();
    }
}
