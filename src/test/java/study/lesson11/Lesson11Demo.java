package study.lesson11;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Lesson11Demo {

    // --- I. TESTNG ANNOTATIONS HIERARCHY ---
    @BeforeSuite
    void beforeSuite() {
        System.out.println("1. Before Suite: Chạy đầu tiên của toàn bộ suite [1]");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("2. Before Test: Chạy trước mỗi thẻ <test> trong XML [1]");
    }

    @BeforeClass
    void beforeClass() {
        System.out.println("3. Before Class: Chạy trước khi class này bắt đầu [1]");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("4. Before Method: Chạy trước mỗi phương thức @Test [1]");
    }

    // --- II. HARD ASSERTION & GROUPING ---
    @Test(priority = 1, groups = { "sanity" })
    void testHardAssert() {
        System.out.println("--- Đang chạy Hard Assert (Group: Sanity) ---");
        String expected = "Selenium";
        String actual = "Selenium";
        // Hard Assert: Dừng ngay lập tức nếu sai [1]
        Assert.assertEquals(actual, expected, "Lỗi: Giá trị không khớp!");
        System.out.println("Dòng này sẽ hiện nếu Hard Assert thành công.");
    }

    // --- III. SOFT ASSERTION ---
    // @Test(priority = 2, groups = { "regression" })
    // void testSoftAssert() {
    //     System.out.println("--- Đang chạy Soft Assert (Group: Regression) ---");
    //     SoftAssert softAssert = new SoftAssert();

    //     System.out.println("Bước 1: Kiểm tra sai nhưng không dừng...");
    //     softAssert.assertTrue(false); // Giả định sai [1]

    //     System.out.println("Bước 2: Vẫn tiếp tục chạy đến đây dù bước 1 fail [1]");
    //     softAssert.assertEquals(1, 1);

    //     // Bắt buộc phải có assertAll() để báo cáo các lỗi đã thu thập [1]
    //     softAssert.assertAll();
    // }

    // --- IV. DATAPROVIDER (Parameterization) ---
    @DataProvider(name = "loginData")
    public Object[][] dataSupplier() {
        return new Object[][] {
                { "admin", "admin123" },
                { "user", "user123" }
        };
    }

    @Test(priority = 3, dataProvider = "loginData", groups = { "regression" })
    void testWithDataProvider(String user, String pass) {
        System.out.println("DataProvider: Testing login with -> User: " + user + " | Pass: " + pass + " [1]");
    }

    // --- AFTER ANNOTATIONS ---
    @AfterMethod
    void afterMethod() {
        System.out.println("5. After Method: Chạy sau mỗi phương thức @Test [1]");
    }

    @AfterClass
    void afterClass() {
        System.out.println("6. After Class: Chạy sau khi tất cả test trong class kết thúc [1]");
    }

    @AfterTest
    void afterTest() {
        System.out.println("7. After Test: Chạy sau khi kết thúc thẻ <test> trong XML [1]");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("8. After Suite: Chạy cuối cùng sau khi hoàn tất mọi thứ [1]");
    }
}