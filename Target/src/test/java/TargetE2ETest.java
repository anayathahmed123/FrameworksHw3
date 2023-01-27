import Pages.TargetBrunch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
        import static org.testng.Assert.assertTrue;

public class TargetE2ETest extends TargetBrunch {





    @Test
    public void TargetTest() throws Exception {
        //click on categories
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div/nav/div[2]/a")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Grocery")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//span[text()='Show 11 more categories']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Brunch Ideas")).click();



        // Add the products to the array list
        products.add("Simply Orange Pulp Free Juice - 52 fl oz");
        products.add("Organic Cage-Free Fresh Grade A Large Brown Eggs - 12ct - Good & Gather™");
//            products.add("Annie's Organic Cinnamon Rolls with Icing - 17.5oz/5ct");
        Thread.sleep(15000);


        // Assert that the products are displayed on the page
        String xpath = "//span[contains(text(),'";
        for (int i = 0; i < products.size(); i++) {
            if (i == products.size() - 1) {
                xpath += products.get(i) + "')]";
            } else {
                xpath += products.get(i) + "') or contains(text(),'";
            }
        }
        List<WebElement> actualProductNames = driver.findElements(By.xpath(xpath));
        List<String> actualProductNamesAsStrings = new ArrayList<>();
        for (WebElement product : actualProductNames) {
            actualProductNamesAsStrings.add(product.getText());
        }
    }
}
