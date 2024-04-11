import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LoginTest extends BaseTest{
    @Test
    public void logInOK() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.signIn("technopol60", "technopolisPassword");
        HomePage homePage = loginPage.logIn();
        Assertions.assertTrue(homePage.checkMoment());
    }
}
