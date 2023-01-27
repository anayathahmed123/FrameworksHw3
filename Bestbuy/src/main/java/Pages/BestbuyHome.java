package Pages;

import Utility.Clicking;
import org.openqa.selenium.By;

import java.util.HashMap;

public class BestbuyHome extends Clicking {

    private String menuButtonLocator, videoGamesButtonLocator, playstation5ButtonLocator, ps5GamesButtonLocator;

    public String getMenuButtonLocator(){return menuButtonLocator;}
    public void setMenuButtonLocator(String menuButtonLocator){
        this.menuButtonLocator = menuButtonLocator;
    }

    public String getVideoGamesButtonLocator(){return videoGamesButtonLocator;}
    public void setVideoGamesButtonLocator(String menuButtonLocator){
        this.videoGamesButtonLocator = videoGamesButtonLocator;
    }

    public String getPlaystation5ButtonLocator(){return playstation5ButtonLocator;}
    public void setPlaystation5ButtonLocator(String playstation5ButtonLocator){
        this.playstation5ButtonLocator = playstation5ButtonLocator;
    }

    public String getPs5GamesButtonLocator(){return ps5GamesButtonLocator;}
    public void setPs5GamesButtonLocator(String ps5GamesButtonLocator){
        this.ps5GamesButtonLocator = ps5GamesButtonLocator;
    }

    public void clickMenuButton(){
        setMenuButtonLocator("");
        ButtonClicker(getMenuButtonLocator());
    }

    public void clickVideoGamesButton(){
        setVideoGamesButtonLocator("");
        ButtonClicker(getVideoGamesButtonLocator());
    }

    public void clickPlaystation5Button(){
        setPlaystation5ButtonLocator("");
        ButtonClicker(getPlaystation5ButtonLocator());
    }

    public void clickPs5GamesButton(){
        setPs5GamesButtonLocator("");
        ButtonClicker(getPs5GamesButtonLocator());
    }

//method for all of these clicks
    public void getToTheGames() throws Exception{
        clickMenuButton();
        Thread.sleep(2000);
        clickVideoGamesButton();
        Thread.sleep(2000);
        clickPlaystation5Button();
        Thread.sleep(2000);
        clickPs5GamesButton();
    }

//method to add prices and video game titles to hashmap
    private static HashMap<String, String> gamePrices;
    private static HashMap<String, By> locators;

    locators.put("Hogwarts Legacy Deluxe Edition - PlayStation 5","");
    locators.put("Resident Evil 4 - PlayStation 5","");
    locators.put("New Tales from the Borderlands Deluxe Edition - PlayStation 5","");

    gamePrices = new HashMap<String, String>();
    gamePrices.put("","");
    gamePrices.put("","");
    gamePrices.put("","");




//combines get to games, and hashmap test methods into one E2Etest
    public void searchPriceTest(){

    }
}
