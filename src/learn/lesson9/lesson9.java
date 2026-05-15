package lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.time.Duration;

import javax.swing.Action;

public class lesson9 {
    public static void main() {
        uploadFile();
    }

    static void table1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://testautomationpractice.blogspot.com/");
        int tableRow = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int tableColumn = driver.findElements(By.xpath("(//table[@name='BookTable']//tr)[2]/td")).size();

        System.out.println("tableRow: " + tableRow);
        System.out.println("tableColumn: " + tableColumn);

        for (int i = 2; i <= tableRow; i++) {
            for (int j = 1; j <= tableColumn; j++) {
                WebElement tableCell = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + i + "]/td[" + j + "]"));
                System.out.println(tableCell.getText());
            }
            System.out.println("=====================");
        }

        driver.close();
    }

    static void table2() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://testautomationpractice.blogspot.com/");
        int tableRow = driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
        int tableColumn = driver.findElements(By.xpath("//table[@id='taskTable']//th")).size();

        System.out.println("tableRow: " + tableRow);
        System.out.println("tableColumn: " + tableColumn);

        for (int i = 1; i <= tableRow; i++) {
            for (int j = 1; j <= tableColumn; j++) {
                WebElement tableCell = driver.findElement(
                        By.xpath("//table[@id='taskTable']//tr[" + i + "]/td[" + j + "]"));
                System.out.println(tableCell.getText());
            }
            System.out.println("=====================");
        }

        driver.close();
    }

    static void hover() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("");

        WebElement hoverTarget = driver.findElement(By.xpath("null"));

        Actions actions = new Actions(driver);

    }

    static void dragDrop() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("div#draggable")));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement dragMe = driver.findElement(By.cssSelector("div#draggable"));
        WebElement dropHere = driver.findElement(By.cssSelector("div#droppable"));

        
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe, dropHere).perform();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void uploadFile() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://testing.qaautomationlabs.com/file-upload.php");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement uploadFile = driver.findElement(By.cssSelector("input#fileInput"));
        uploadFile.sendKeys("D:\\Automation_test\\k5_automation\\target");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
}
