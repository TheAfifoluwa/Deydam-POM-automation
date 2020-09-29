package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.SigninPage;

public class setupTest {
    //create web driver object
    private WebDriver driver;
    //create sign in page object
    protected SigninPage signinPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //launch application
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //Instantiate sign in page
        signinPage= new SigninPage(driver);

    }
    @AfterTest
    //close browser
    public void closeBrower(){
        driver.quit();
    }
}
