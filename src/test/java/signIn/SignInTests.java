package signIn;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.SigninPage;
import setUp.setupTest;

public class SignInTests extends setupTest {
    @Test
    public void testSignin()throws InterruptedException{
        signinPage.enterUsername("Mintydreams");
        signinPage.enterPassword("admin123");
        DashboardPage dashboardPage= SigninPage.clickSigninBtn();
        dashboardPage.clickUser();
        signinPage= dashboardPage.clickLogout();
    }
}
