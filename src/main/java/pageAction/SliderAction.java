package pageAction;

import commons.BasePage;
import commons.DriverManager;
import commons.LocatorType;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;
import pageUI.LoginPageUI;
import pageUI.SliderUI;

public class SliderAction extends BasePage {
    @Step("Input username {0}")
    public SliderAction sliderToRight(){
        Actions action = new Actions(DriverManager.getDriver()) ; //class Actions có sẵn trong thư viện selenium để xử lý hành động phức tạp của người dùng
        action.dragAndDropBy(findElement(LocatorType.Xpath, SliderUI.slider), 500,0).perform();
        return this;
    }
}
