package Utility;

import org.openqa.selenium.By;

public class Typing extends Clicking{
    //try catch to try multiple different locators when I need to send keys for something
    public static void Typewriter(String locators){
        try {
            driver.findElement(By.xpath(locators)).sendKeys();
        }catch (Exception e){
            try {
                driver.findElement(By.cssSelector(locators)).sendKeys();
            }catch (Exception e1){
                try {
                    driver.findElement(By.id(locators)).sendKeys();
                }catch (Exception e2){
                   try {
                       driver.findElement(By.linkText(locators)).sendKeys();
                   }catch (Exception e3){
                      try {
                          driver.findElement(By.partialLinkText(locators)).sendKeys();
                      }catch (Exception e4){
                          driver.findElement(By.className(locators)).sendKeys();
                      }
                   }
                }

            }
        }

    }

}
