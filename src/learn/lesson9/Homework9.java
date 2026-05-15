package lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class Homework9 {
    public static void main() {
      //  fligth();
        Action();
    }

    static void fligth() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://blazedemo.com/");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tbody/tr"));

        String firstPriceText = driver.findElement(By.xpath("//table[@class='table']//tbody/tr[4]/td[3]")).getText();
        double minPrice = Double.parseDouble(firstPriceText.replace("$", ""));
        int minRowIndex = 1; // Lưu lại chỉ số dòng đầu tiên là 1

        // 3. Chạy vòng lặp từ dòng thứ HAI (i = 2) trở đi để so sánh với min [1]
        for (int i = 2; i <= rows.size(); i++) {
            // Lấy giá của dòng hiện tại
            String currentPriceText = driver.findElement(By.xpath("//table[@class='table']//tbody/tr[" + i + "]/td[3]"))
                    .getText();
            double currentPrice = Double.parseDouble(currentPriceText.replace("$", ""));

            // 4. Logic so sánh: Nếu giá hiện tại NHỎ HƠN min thì cập nhật lại min mới
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
                minRowIndex = i; // Gán lại vị trí dòng có giá thấp nhất mới
            }
        }

        // 5. Sau khi hết vòng lặp, click vào nút "Choose This Flight" của dòng có
        // minRowIndex

        driver.findElement(By.xpath("//table[@class='table']//tbody/tr[" + minRowIndex + "]//input[@type='submit']"))
                .click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

        String msg = driver.findElement(By.xpath("//h1")).getText();
        if (msg.equals("Thank you for your purchase today!")) {
            System.out.println("Test Passed!");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }

    static void Action() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        // 2. Khởi tạo đối tượng Actions (Theo tài liệu Lesson 9)
        Actions actions = new Actions(driver);

        // --- THỰC HIỆN KÉO THẢ CHO PHẦN DEBIT ---

        // Kéo nút BANK vào ô Account
        WebElement bankSource = driver.findElement(By.xpath("//li[@id='credit2']/a"));
        WebElement debitAccountTarget = driver.findElement(By.xpath("//ol[@id='bank']/li"));
        actions.dragAndDrop(bankSource, debitAccountTarget).perform();

        // Kéo số 5000 vào ô Amount
        WebElement amount5000Source = driver.findElement(By.xpath("//li[@id='fourth']/a"));
        WebElement debitAmountTarget = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
        actions.dragAndDrop(amount5000Source, debitAmountTarget).perform();

              try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }

}