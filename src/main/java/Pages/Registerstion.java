package Pages;

import Utils.properties;
import browsers.DriverFactory;
import org.openqa.selenium.By;

import static browsers.DriverFactory.driver;

public class Registerstion {
    public static void RegisterWithValidUser (){
        DriverFactory.getDriver();
        driver.get("https://practicesoftwaretesting.com/auth/register");
        driver.findElement(By.id("first_name")).sendKeys("marshall");
        driver.findElement(By.id("last_name")).sendKeys("bod");
        driver.findElement(By.id("dob")).sendKeys("2004-06-24");
        driver.findElement(By.id("street")).sendKeys("wilnfmweiofmweiofmweionf");
        driver.findElement(By.id("postal_code")).sendKeys("33669944");
        driver.findElement(By.id("city")).sendKeys("Cai");
        driver.findElement(By.id("state")).sendKeys("madii");
        driver.findElement(By.id("country")).sendKeys("Egypt");
        driver.findElement(By.id("phone")).sendKeys("1091148479");
        driver.findElement(By.id("email")).sendKeys(properties.dumyaccount);
        driver.findElement(By.id("password")).sendKeys("******dfKKmeolcf,elfem,23***");
        driver.findElement(By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abdo00011100hm@gmail.com");
        driver.findElement(By.id("password")).sendKeys("******dfKKmeolcf,elfem,23****");
    }
}

