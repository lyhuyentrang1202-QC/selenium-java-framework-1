package step;

import pageVerification.LoginPageVerification;
import commons.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageAction.LoginPageAction;
import pageAction.SliderAction;

public class SliderDemo extends BaseTest {
    private final Logger log = LogManager.getLogger(SliderDemo.class);
    private final SliderAction slider = new SliderAction();

    @Test(priority = 0)
    void slider() {
        try {
            Thread.sleep(10000); // Đợi trang kiểm tra bảo mật (Cloudflare) chuyển hướng
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // System.out.println("DEBUG - Page Source: " + commons.DriverManager.getDriver().getPageSource());
        slider.sliderToRight();

        try {

            Thread.sleep(5000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
    }
}
