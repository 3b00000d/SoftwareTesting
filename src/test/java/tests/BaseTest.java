package tests;
import Pages.*;
import browsers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;
    Registerstion registration;
    Login login;
    Home home;
    Product product;
    CheckOut checkOut;
    Contact contact;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver();
        registration = new Registerstion();
        login = new Login();
        home = new Home();
        product = new Product();
        checkOut = new CheckOut();
        contact = new Contact();
    }

    @Test
    public void completeFlowTest() {
        registration.RegisterWithValidUser();
        login.LoginWithValidUser();
        home.navigateToHome();
        home.SearchForProduct();
        home.clickOnProduct();
        product.addToCart();
        product.NavigateToCart();
        checkOut.NavigateToCart();
        checkOut.clickOnCheckoutButton();
        login.LoginWithValidUser();
        contact.navigateToContactPage();
        contact.fillContactForm();


    }
}