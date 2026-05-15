package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    @Parameters({"url", "browser"})
    @BeforeTest
    protected void setupDriver(String url, String browser) {
        WebDriver driver = null;
        System.out.println("Browser: " + browser);
        switch (browser) {
            case "edge" -> {
                EdgeOptions options = new EdgeOptions(); //một class của thư viện selenium để cấu hình trình duyệt trước khi chạy, cài đặt cách browser sẽ chạy
                driver = new EdgeDriver(options);
            }

            case "hedge" -> {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--headless"); 
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-gpu");
                options.addArguments("--user-data-dir=/tmp/edge-profile-" + System.currentTimeMillis());
                



                // headless = chạy ngầm không hiển thị UI
                // Run browser without UI (faster, dùng cho CI/CD)
                // options.addArguments("--headless");

                // Disable popup notification (tránh che button)
                // options.addArguments("--disable-notifications");

                // Open incognito mode (không lưu cache, sạch dữ liệu)
                // options.addArguments("--incognito");

                // Start browser full screen
                // options.addArguments("--start-maximized");

                // Set window size (fix UI responsive)
                // options.addArguments("--window-size=1920,1080");

                // Disable extensions (tránh lỗi do extension)
                // options.addArguments("--disable-extensions");

                // Ignore SSL errors (dùng cho môi trường test)
                // options.addArguments("--ignore-certificate-errors");

                // Improve stability khi chạy CI/Linux
                // options.addArguments("--no-sandbox");
                // options.addArguments("--disable-dev-shm-usage");

                driver = new EdgeDriver(options);
            }


            case "chrome" -> {
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);
            }
        }

        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(url);

    }
    

    @AfterTest
    protected void tearDown(){
        try{
            DriverManager.getDriver().quit();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
