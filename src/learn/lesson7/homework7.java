package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;

public class homework7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
        driver.findElement(By.className("wikipedia-search-button")).click();
        Thread.sleep(1000);

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
        System.out.println("So luong link tim thay " + links.size());

        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
        }
        Thread.sleep(3000);

        Set<String> windowIDs = driver.getWindowHandles();

        for (String winId : windowIDs) {
            String title = driver.switchTo().window(winId).getTitle();

            if (title.equals("Selenium - Wikipedia")) {
                driver.close();
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
