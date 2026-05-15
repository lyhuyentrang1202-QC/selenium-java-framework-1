package study.lesson10;
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


public class Lesson10Exercise {

    @Parameters({"url"})
    @Test
    void Login(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
        username.sendKeys("standard_user");
        
        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        password.sendKeys("secret_sauce"); 
        
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
        loginButton.click(); 

        driver.close();

    }


}
