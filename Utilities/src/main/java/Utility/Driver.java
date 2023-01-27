package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver = null;

    @BeforeMethod
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.target.com");

        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
    }

//    @AfterMethod
//    public void shutDown(){
//        driver.close();
//    }
}
