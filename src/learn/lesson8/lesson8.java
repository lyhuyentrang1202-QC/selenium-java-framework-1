package lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class lesson8 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        WebElement maleRadioButton = driver.findElement(By.cssSelector("label[for='male']"));
        maleRadioButton.click();

        List<WebElement> checkbox = driver.findElements(By.xpath("//label[@for='hobbies']//following-sibling::div//input"));
        for (WebElement checkboxes : checkbox) {
            if (checkboxes.getAttribute("id").equals("traveling")) ;
            checkboxes.click();
            driver.close();
        }
    }

    public static void iframe(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://testing.qaautomationlabs.com/iframe.php");
        driver.switchTo().frame("iframe1");
        WebElement iframe1 = driver.findElement(By.xpath("//button[text()='CLick Me']"));
        iframe1.click();
        driver.switchTo().defaultContent();
        String text = driver.findElement(By.xpath("//p[@id='message']")).getText();
        System.out.println("Text: " + text);

        driver.close();
    }

    public static void dropdown (String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://testing.qaautomationlabs.com/dropdown.php");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='fruitDropdown']"));
        Select fruit = new Select(dropdown);
        fruit.selectByValue("Mango");

        String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("Text: " + text);


        driver.close();
    }
}