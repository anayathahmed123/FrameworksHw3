package Pages;

import Utility.Clicking;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.HashMap;



public class BestbuyHome extends Clicking {
    //Variables for each buttons locator
    private String menuButtonLocator, videoGamesButtonLocator, playstation5ButtonLocator, ps5GamesButtonLocator;

    //Getter and Setter methods for menuButtonLocator
    public String getMenuButtonLocator(){return menuButtonLocator;}
    public void setMenuButtonLocator(String menuButtonLocator){
        this.menuButtonLocator = menuButtonLocator;
    }

    //Getter and Setter methods for videoGamesButtonLocator
    public String getVideoGamesButtonLocator(){return videoGamesButtonLocator;}
    public void setVideoGamesButtonLocator(String videoGamesButtonLocator){
        this.videoGamesButtonLocator = videoGamesButtonLocator;
    }

    //Getter and Setter methods for playstation5ButtonLocator
    public String getPlaystation5ButtonLocator(){return playstation5ButtonLocator;}
    public void setPlaystation5ButtonLocator(String playstation5ButtonLocator){
        this.playstation5ButtonLocator = playstation5ButtonLocator;
    }

    //Getter and Setter methods for ps5GamesButtonLocator
    public String getPs5GamesButtonLocator(){return ps5GamesButtonLocator;}
    public void setPs5GamesButtonLocator(String ps5GamesButtonLocator){
        this.ps5GamesButtonLocator = ps5GamesButtonLocator;
    }

    //Method to click Menu button
    public void clickMenuButton(){
        setMenuButtonLocator("//button[text()='Menu']");
        ButtonClicker(getMenuButtonLocator());
    }

    //Method to click Video Games button
    public void clickVideoGamesButton(){
        setVideoGamesButtonLocator("//button[text()='Video Games']");
        ButtonClicker(getVideoGamesButtonLocator());
    }

    //Method to click Playstation 5 button
    public void clickPlaystation5Button(){
        setPlaystation5ButtonLocator("//button[text()='PlayStation 5']");
        ButtonClicker(getPlaystation5ButtonLocator());
    }

    //Method to click Ps5 Games button
    public void clickPs5GamesButton(){
        setPs5GamesButtonLocator("//a[text()='PlayStation 5 Games']");
        ButtonClicker(getPs5GamesButtonLocator());
    }

//method for all the button clicks to be done in one method
    public void getToTheGames() throws Exception{
        Thread.sleep(2000);
        clickMenuButton();
        Thread.sleep(2000);
        clickVideoGamesButton();
        Thread.sleep(2000);
        clickPlaystation5Button();
        Thread.sleep(2000);
        clickPs5GamesButton();
    }
}
////
//    private String searchBarLocator;
//
//    public String getSearchBarLocator(){return searchBarLocator;}
//    public void setSearchBarLocator(String searchBarLocator){
//        this.searchBarLocator = searchBarLocator;
//    }
//
//    public void typeInSearchBar(){
//        setSearchBarLocator("//button[text()='Menu']");
//        TypeWriter(getSearchBarLocator());
//    }



//combines get to games, and hashmap test methods into one E2Etest
//    public static void searchPriceTest() throws Exception{
//        getToTheGames();
//        Thread.sleep(5000);
//        Hashmaps();
//    }
//}
