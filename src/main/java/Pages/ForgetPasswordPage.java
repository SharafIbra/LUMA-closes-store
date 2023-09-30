package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage extends basePage {

    private final By email = new By.ById("email_address");
    private final By resetmypassword = new By.ByXPath("//*[@id=\"form-validate\"]/div/div[1]/button");
    private final By status = new By.ByXPath("//html/body/div[2]/main/div[2]/div[2]/div/div/div");

    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String Email) {
        sendKeys(email, Email);
    }

    public void clickResetMyPassword() {
        click(resetmypassword);
    }

    public String getStatus() {
        return driver.findElement(status).getText();
    }


}