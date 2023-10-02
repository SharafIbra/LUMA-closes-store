package ForgetPassword;

import base.BaseTests;
import org.testng.annotations.Test;

public class ForgetPasswordPageTests extends BaseTests {


    @Test
    public void testForgetPassword() {
        var forget = homePage.clickForgetPasswordPage();
        forget.enterEmail(email);
        forget.clickResetMyPassword();
        forget.verifyResetPassword();
    }


}
