package Pages;


import Utils.properties;
import org.openqa.selenium.By;

import static browsers.DriverFactory.driver;

public class Login {

    public static void LoginWithValidUser() {
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.findElement(By.id("email")).sendKeys(properties.dumyaccount);
        driver.findElement(By.id("password")).sendKeys("******dfKKmeolcf,elfem,23***");
        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[3]/input")).click();
        driver.get("https://practicesoftwaretesting.com/contact");
    }
}
