import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FriendsTest {
    HomePage homePage;
    FriendsPage friendsPage;
    @BeforeEach
    public void setup() {
        homePage = BaseTest.setUp();
    }
    @Test
    public void testFriends(){
        FriendsPage friendsPage = homePage.clickOnFriends();
        friendsPage.addFriend();
        Assertions.assertTrue(friendsPage.getResult().equals("Запрос отправлен"));
        friendsPage.cancelFriendship();
    }
    @AfterEach
    public void tearDown() {
        friendsPage.cancelFriendship();
    }
}
