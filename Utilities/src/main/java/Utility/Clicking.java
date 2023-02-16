package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Clicking {

    //try catch to try multiple different locators when I need to click something
    public static void ButtonClicker(String locators) {
        try {
            Driver.driver.findElement(By.xpath(locators)).click();
        } catch (Exception e) {
               try {
                   Driver.driver.findElement(By.linkText(locators)).click();
               }catch (Exception e1){
                   try {
                       Driver.driver.findElement(By.partialLinkText(locators)).click();
                   }catch (Exception e2){
                      try {
                          Driver.driver.findElement(By.cssSelector(locators)).click();
                      }catch (Exception e3){
                         try {
                             Driver.driver.findElement(By.id(locators)).click();
                         }catch (Exception e4){
                                Driver.driver.findElement(By.className(locators)).click();
                         }
                      }
                   }
               }
        }
    }

    //javascript executor method to click back on a page
    public static void clickBack(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.driver;
        js.executeScript("window.history.back()");
    }

//    //send keys
//    public static void typeInLetters(){
//
//    }

}



