package Utility;

import org.openqa.selenium.By;


public class Clicking extends Driver {
    //try catch to try multiple different locators when I need to click something
    public static void ButtonClicker(String locators) {
        try {
            driver.findElement(By.xpath(locators)).click();
        } catch (Exception e) {
               try {
                   driver.findElement(By.linkText(locators)).click();
               }catch (Exception e1){
                   try {
                       driver.findElement(By.partialLinkText(locators)).click();
                   }catch (Exception e2){
                      try {
                          driver.findElement(By.cssSelector(locators)).click();
                      }catch (Exception e3){
                         try {
                             driver.findElement(By.id(locators)).click();
                         }catch (Exception e4){
                                driver.findElement(By.className(locators)).click();
                         }
                      }
                   }
               }
        }
    }
}



