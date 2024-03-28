import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoginPageTest {
    private final static String BASE_URL = "https://ok.ru/";
    private final static String LOGIN = "technopol37";
    private final static String PASSWORD = "technopolisPassword";
    @BeforeEach
    public void init(){
        new LoginPage(BASE_URL);
    }

    @Test
    public void authorized(){
        LoginPage loginPage = new LoginPage(BASE_URL);
        loginPage.enterLogin(LOGIN);
        loginPage.enterPassword(PASSWORD);
        loginPage.clickLoginButton();
        succes();
    }
    public void succes(){
        Assertions.assertTrue(new HomePage().USERNAME.isDisplayed());
    }
}