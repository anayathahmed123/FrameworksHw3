package Utility;

import org.openqa.selenium.By;

public class Typing {
    //try catch to try multiple different locators when I need to send keys for something
    public static void TypeWriter(String locators){
        try {
            Driver.driver.findElement(By.xpath(locators)).sendKeys();
        }catch (Exception e){
            try {
                Driver.driver.findElement(By.cssSelector(locators)).sendKeys();
            }catch (Exception e1){
                try {
                    Driver.driver.findElement(By.id(locators)).sendKeys();
                }catch (Exception e2){
                   try {
                       Driver.driver.findElement(By.linkText(locators)).sendKeys();
                   }catch (Exception e3){
                      try {
                          Driver.driver.findElement(By.partialLinkText(locators)).sendKeys();
                      }catch (Exception e4){
                          Driver.driver.findElement(By.className(locators)).sendKeys();
                      }
                   }
                }

            }
        }

    }

}
