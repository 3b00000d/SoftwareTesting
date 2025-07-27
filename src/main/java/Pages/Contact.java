package Pages;

import Utils.properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static browsers.DriverFactory.driver;

public class Contact {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public void navigateToContactPage() {
        driver.get("https://practicesoftwaretesting.com/contact");
    }
    public void fillContactForm(){
        driver.findElement(By.id("first_name")).sendKeys("marshall");
        driver.findElement(By.id("last_name")).sendKeys("bod");
        driver.findElement(By.id("email")).sendKeys(properties.dumyaccount);
        driver.findElement(By.id("subject")).click();
        driver.findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[1]/div/select/option[6]")).click();
        driver.findElement(By.id("message")).sendKeys("wooooooooooooooooooooooooooooooooilfnwril;fmwe;fiowehifjqwe;mofjqwekdfqwefnroooooooooooooo");
        driver.findElement(By.xpath("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[4]/input")).click();



        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".alert.alert-success.mt-3")
        ));

        String actualText = successMessageElement.getText();
        String expectedMessage = "Thanks for your message! We will contact you shortly.";
        if (!actualText.contains(expectedMessage)) {
            throw new AssertionError("Success message not found!");


    }}
}
