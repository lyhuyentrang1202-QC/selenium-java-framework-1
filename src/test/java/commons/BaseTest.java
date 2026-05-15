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
                options.addArguments("--headless=new"); 
                options.addArguments("--remote-allow-origins=*");
                // Sử dụng thư mục tạm của hệ thống để tránh lỗi đường dẫn trên Windows/Linux
                String tmpDir = System.getProperty("java.io.tmpdir");
                options.addArguments("--user-data-dir=" + tmpDir + "edge-profile-" + System.currentTimeMillis());
                
                // Các tham số bổ trợ độ ổn định
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");

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
