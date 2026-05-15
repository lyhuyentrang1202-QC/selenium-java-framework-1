package step;

import commons.BaseTest;
import commons.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageAction.LoginPageAction;
import pageVerification.LoginPageVerification;

public class SwaglabTest extends BaseTest {

    private final LoginPageAction loginPage = new LoginPageAction();
    private final LoginPageVerification loginVerify = new LoginPageVerification();

   @Test(priority = 0)
void loginTest() {
    loginPage.setUserName("standard_user1")
            .setPassword("secret_sauce")
            .clickLoginButton();
    loginVerify.verifyLoginSuccessful();
}

@Test(dependsOnMethods = "loginTest")
void addToCart() {
    System.out.println("Add to cart");
}

}
