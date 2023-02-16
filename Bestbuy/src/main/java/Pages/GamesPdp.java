package Pages;

import Utility.Clicking;
import Utility.Driver;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

public class GamesPdp {
    private Clicking clicking = new Clicking();

    private String sortByDropdownLocator, aToZOptionLocator;

    public String getSortByDropdownLocator(){return sortByDropdownLocator;}
    public void setSortByDropdownLocator(String sortByDropdownLocator){
        this.sortByDropdownLocator = sortByDropdownLocator;
    }

    public String getaToZOptionLocator(){return getaToZOptionLocator();}
    public void setaToZOptionLocator(String aToZOptionLocator){
        this.aToZOptionLocator = aToZOptionLocator;
    }

    public void clickSortByDropdown(){
        setSortByDropdownLocator("//select[text()='sort-by-select']");
        clicking.ButtonClicker(getSortByDropdownLocator());
    }

    public void clickAtoZ(){
        setaToZOptionLocator("//option[text()='Title A-Z']");
        clicking.ButtonClicker(getaToZOptionLocator());
    }


    public void sortingGames(){
        clickSortByDropdown();
        clickAtoZ();
    }

    //Method to get video game prices elements into hashmap and then assert if they are on the webpage
    public void Hashmaps(){
        //Hashmap to store the elements of the game prices
        HashMap<String, String> elementsPrices = new HashMap<>();
        // /html/body/div[5]/main/div[12]/div/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[5]/ol/li[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/span[1]
        elementsPrices.put("Hogwarts Legacy - PlayStation 5", Driver.driver.findElement(By.xpath("//span[text()='$69.99']")).getText());
        //    /html/body/div[5]/main/div[12]/div/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[5]/ol/li[20]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/span[1]
        elementsPrices.put("God of War Ragnarök - PlayStation 5", Driver.driver.findElement(By.xpath("//span[text()='$69.99']")).getText());
        // /html/body/div[5]/main/div[12]/div/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[5]/ol/li[12]/div/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div/span[1]
        elementsPrices.put("Crisis Core-Final Fantasy VII-Reunion - PlayStation 5", Driver.driver.findElement(By.xpath("//span[text()='$49.99']")).getText());

        //for loop to search through the hashmap and get the keys and values
        for (HashMap.Entry<String, String> entry : elementsPrices.entrySet()) {
            String gameTitle = entry.getKey();
            String expectedPrice = entry.getValue();
            String actualPrice = Driver.driver.findElement(By.xpath("//*[text()='" + gameTitle + "']/following-sibling::div/span[1]")).getText();
            //assert to see if the expected price and actual price are the same
            SoftAssert softasserting = new SoftAssert();
            softasserting.assertEquals(expectedPrice, actualPrice);

        }

}}
