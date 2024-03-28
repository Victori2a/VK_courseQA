import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriendsPageTest extends BaseTest{
    @Test
    public void testFriends(){
        HomePage homePage = new HomePage();
        homePage.clickOnFriends();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.addFriend();
        Assertions.assertTrue(friendsPage.getResult().equals("Запрос отправлен"));
        friendsPage.cancelFriendship();
    }
}
