import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    private static HomePage homePage = null;
    private static final String LOGIN = "technopol37";
    private static final String PASSWORD = "technopolisPassword";

    @BeforeAll
    public static void setupConf() {
        Configuration.browser = CHROME;
        Configuration.baseUrl = "https://ok.ru/";
        Selenide.open("/");
    }

    public static HomePage setUp() {
        LoginPage loginPage = new LoginPage();
        loginPage.signIn(LOGIN, PASSWORD);
        homePage = loginPage.logIn();
        return homePage;
    }

    @AfterEach
    public void endJob() {
        homePage.logOut();
        clearBrowserCache();
        Selenide.closeWebDriver();
    }
}
