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


    public LoginPage open() {
        Selenide.open("/");
        checkLoginPage();
        return this;
    }
    public void checkLoginPage() {
        (LOGIN_FIELD).shouldBe(visible);
        (PASSWORD_FIELD).shouldBe(visible);
        (LOGIN_BUTTON).shouldBe(visible);
    }
    public void signIn(String login, String password) {
        (LOGIN_FIELD).shouldBe(visible).setValue(login);
        (PASSWORD_FIELD).shouldBe(visible).setValue(password);
    }
    public HomePage logIn() {
        (LOGIN_BUTTON).shouldBe(visible).click();
        return new HomePage();
    }
}
