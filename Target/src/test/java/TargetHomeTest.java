import Pages.TargetHome;
import Utility.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TargetHomeTest extends TargetHome {

    @BeforeMethod
    public void startCurrent(){
        Driver.startUp();
        Driver.driver.get("https://www.target.com");
    }

    @Test
    public void TargetClickTest() throws Exception{
        targetClicks();
    }

    @AfterMethod
    public static void shutDown(){
        Driver.driver.close();
    }
}
