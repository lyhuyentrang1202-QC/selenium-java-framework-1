package lesson8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework8_1 {

    public static void main(String[] args) {
        checkbox();
        radioButton();
        iframe();
    }

    // checkbox
    public static void checkbox() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/checkboxes");

        WebElement checkbox = driver.findElement(By.id("checkbox1"));

        checkbox.click();
        System.out.println("Checkbox selected: " + checkbox.isSelected());
        checkbox.click();
        System.out.println("Checkbox selected: " + checkbox.isSelected());

        driver.quit();
    }

    // radiobutton
    public static void radioButton() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/radio-buttons");

        WebElement radioRed = driver.findElement(By.xpath("//input[@id='red']"));

        radioRed.click();
        System.out.println("Radiobutton selected: " + radioRed.isSelected());

        WebElement radioBlue = driver.findElement(By.xpath("//input[@id='blue']"));
        radioBlue.click();

        System.out.println("Radiobutton Red selected: " + radioRed.isSelected());
        driver.quit();
    }

    // iframe
    public static void iframe() {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html' and @id='singleframe']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DEMO");
        driver.quit();
    }
}
