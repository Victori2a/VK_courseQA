import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize ="1920x1080";
    }
    @BeforeEach
    public void init(){
        setUp();
    }
    @After
    public void tearDown(){
        new HomePage().exit();
        Selenide.closeWebDriver();
    }
}
