package test_3_LoginPage;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class LoginPageTests extends BaseTests {

    @Test(priority = 1,groups = { "login" }, description = "Valid Login Scenario with valid username and password and save session's cookies")
    public void testLoginValidCredentials() {
        new P01_HomePage(driver).clickLoginPage();
        new P03_LoginPage(driver)
                .setLoginCredentials(email, password)
                .signIn()
                .verifySignINIs_Ok()
                .store_Cookies_Login_Page();

    }


    @Test(priority = 2, description = "Invalid Login Scenario with wrong username and password")
    public void testLoginInValidCredentials() {
        new P01_HomePage(driver).clickLoginPage();
        String password = "__P@ssw0rd__";
        new P03_LoginPage(driver)
                .setLoginCredentials(email, password)
                .signIn()
                .verifySignINIs_InValid()
                .verifySignIs_InValid();
    }



    /*
    * Methods for test cookies functionality
    * */




    @Test(priority = 1, description = "Valid Login Scenario By inject Cookies file")
    public void testLoginExistingUserByInjectCookies_VerifyUserNameAndPassword() {



        new P03_LoginPage(driver)
                .load_Cookies_Login_Page()
                .verifySignIN__Successfully_validateUserName(firstname+" "+lastname);


    }




}
