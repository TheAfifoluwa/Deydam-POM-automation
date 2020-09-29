package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
    private static WebDriver driver;
    public SigninPage(WebDriver driver){
        this.driver=driver;
    }
    //find elements on the sign in page
    private By username= By.id("username");
    public void enterUsername(String uName){
        driver.findElement(username).sendKeys(uName);
    }
    private By password= By.id("password");
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }
    public static DashboardPage clickSigninBtn(){
        //click sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        return new DashboardPage(driver);
    }
}
