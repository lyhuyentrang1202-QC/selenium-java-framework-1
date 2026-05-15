package step;

import commons.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pageAction.LoginPageAction;
import pageVerification.LoginPageVerification;

public class SwaglabFailureTest extends BaseTest {
    private final Logger logger = LogManager.getLogger(SwaglabFailureTest.class);
    private final LoginPageAction loginPage = new LoginPageAction();
    private final LoginPageVerification loginVerification = new LoginPageVerification();

    @Test(priority = 1)
    void loginTestWithLockedUser() {
        loginPage.setUserName("locked_out_user")
                .setPassword("secret_sauce")
                .clickLoginButton();
        loginVerification.verifyLoginLocked();
        logger.trace("trace: loginTestWithLockedUser");
        logger.debug("debug: loginTestWithLockedUser");
        logger.info("info: loginTestWithLockedUser");
        logger.warn("warn: loginTestWithLockedUser");
        logger.error("error: loginTestWithLockedUser");
        logger.fatal("fatal: loginTestWithLockedUser");
    }
}