package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate elements on dashboard page
    private By user = By.className("topbar__avatar-img");
    private By logout = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]");

    public void clickUser() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(user).click();
    }

    public SigninPage clickLogout() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElement(logout).click();
        return new SigninPage(driver);
    }
}
