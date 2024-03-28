import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SettingsPageTest extends BaseTest{
    @Test
    public void testLanguage(){
        HomePage homePage = new HomePage();
        homePage.pressOnSettings();
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.changeLanguage();
        Assertions.assertTrue(settingsPage.getResult().equals("Language"));
    }
}
