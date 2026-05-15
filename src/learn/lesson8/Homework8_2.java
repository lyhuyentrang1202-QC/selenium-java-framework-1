package lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Homework8_2 {
    public static void main(String[] args) {
        employee();
        color();

    }

    public static void employee() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath(("//input[@name='username']")));

        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

        password.sendKeys("admin123");

        WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));

        loginbtn.click();

        WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));

        pim.click();

        WebElement select = driver.findElement(By.xpath(
                "//label[text()='Employment Status']/ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
        select.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Full-Time Contract']")));
        WebElement status = driver.findElement(By.xpath("//span[text()='Full-Time Contract']"));
        status.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }

    public static void color() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement colors = driver.findElement(By.xpath("//select[@id='colors']/child::option[@value='green']"));
        colors.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }
}
