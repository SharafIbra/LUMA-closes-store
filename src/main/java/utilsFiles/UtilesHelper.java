package utilsFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class UtilesHelper {


    protected void sendKeys(WebDriver driver, By byObject, String data) {
        driver.findElement(byObject).sendKeys(data);
    }

    protected void click(WebDriver driver, By byObject) {
        driver.findElement(byObject).click();
    }

    public String getCurrentURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    protected String getText(WebDriver driver, By byObject) {
        return driver.findElement(byObject).getText();
    }

    protected void clear(WebDriver driver, By byObject) {
        driver.findElement(byObject).clear();
    }

    public static WebDriverWait longWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static WebDriverWait shortWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @SuppressWarnings("unchecked")
    protected void fluentWait(WebDriver driver, By byObject) {
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(byObject));
    }


    protected void refreshPage(WebDriver driver){
        driver.navigate().refresh();
    }


}
