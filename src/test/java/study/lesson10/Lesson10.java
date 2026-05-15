package study.lesson10;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import java.time.Duration;

public class Lesson10 {
    @Parameters({ "url", "browser" })
    @Test(priority = 0)
    void Login(String url, String browser) {
        WebDriver driver = null;
        System.out.println("Browser: " + browser);
        switch (browser) {
            case "edge" -> {
                EdgeOptions options = new EdgeOptions();
                driver = new EdgeDriver(options);
            }
            case "hedge" -> {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--headless");
                driver = new EdgeDriver(options);
            }
            case "chrome" -> {
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);
            }
            default -> throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.quit();

    }

}
