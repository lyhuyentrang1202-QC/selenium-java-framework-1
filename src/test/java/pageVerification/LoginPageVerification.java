package pageVerification;


import commons.BasePage;
import commons.LocatorType;
import org.testng.Assert;
import pageUI.LoginPageUI;

public class LoginPageVerification extends BasePage {

    public void verifyLoginSuccessful() {
        String actualUrl = getCurrentUrl();
        String expectUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl,expectUrl,"URL is not match, login failure");
    }

    public void verifyLoginLocked() {
        String actualMessage = getTextElement(LocatorType.CssSelector, LoginPageUI.lockedUserMessage);
        String expectMessage = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(actualMessage,expectMessage,"Message is not match, login failure");
    }
}
