package pageAction;

import commons.BasePage;
import commons.LocatorType;
import pageUI.LoginPageUI;
import io.qameta.allure.Step;

public class LoginPageAction extends BasePage {
    @Step("Input username {0}")  // @step là annotation của Allure dùng để ghi lại bước này vào báo cáo
    //{0}, {1} là gì? ->  Đây là placeholder (chỗ thay thế giá trị) 
    // public LoginPageAction setUserName(String username) 
    // -> username là tham số thứ 0
    public LoginPageAction setUserName(String username) {
        sendKeysElement(LocatorType.Xpath, LoginPageUI.usernameTxt, username);
        return this; //Đây là chaining gọi nhiều hàm nối tiếp nhau trên cùng 1 object
        // khi có chaining code sẽ gọn hơn 
        //      loginPage
        //                  .setUserName("Trang")
        //                  .setPassword("123")
        //                  .clickLoginButton();
        // chạy xong → trả về lại loginPage
        // vì lúc này vẫn là loginPage → gọi tiếp được
    
        // khi không có chaining 
        // loginPage.setUserName("Trang");
        // loginPage.setPassword("123");
        // loginPage.clickLoginButton();
    }

    @Step("Input password {0}")
    public LoginPageAction setPassword(String password) {
        sendKeysElement(LocatorType.Xpath, LoginPageUI.passwordTxt, password);
        return this;
    }

    @Step("Click login button")
    public LoginPageAction clickLoginButton() {
        clickElement(LocatorType.CssSelector, LoginPageUI.loginBtn);
        return this;
    }
}