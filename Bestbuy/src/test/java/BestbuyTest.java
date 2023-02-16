import Pages.BestbuyHome;
import Pages.GamesPdp;
import Utility.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BestbuyTest extends BestbuyHome {

    @BeforeMethod
    public void startCurrent(){
        Driver.startUp();
        Driver.driver.get("https://www.bestbuy.com");
    }

// the end to end test for Bestbuy
    @Test
    public void BestbuySearchTest() throws Exception{
       //searchPriceTest();
        getToTheGames();

        //clickBack();
        //Hashmaps();
    }

    @AfterMethod
    public static void shutDown(){
        Driver.driver.close();
    }


}
