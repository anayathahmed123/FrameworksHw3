import Pages.BestbuyHome;
import org.testng.annotations.Test;

public class BestbuyTest extends BestbuyHome {
// the end to end test
    @Test
    public void BestbuySearchTest() throws Exception{
        SearchPriceTest();
    }

}
