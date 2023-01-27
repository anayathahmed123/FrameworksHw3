package Utility;

import org.openqa.selenium.By;


public class Clicking extends Driver {
    public static void ButtonClicker(String locators) {
        try {
            driver.findElement(By.xpath(locators)).click();
        } catch (Exception e) {
                driver.findElement(By.linkText(locators)).click();
        }
    }
}



