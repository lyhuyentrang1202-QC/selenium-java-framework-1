package lesson4.exercise4_2;

public class Logger {

    // 1
    void log(String message) {
        System.out.println("[INFO] " + message);
    }

    // 2
    void log(String message, String level) {
        System.out.println("[" + level + "] " + message);
    }

    // 3
    void log(String testName, String step, boolean passed) {
        String status;
        if (passed) {
            status = "PASS";
        } else {
            status = "FAIL";
        }
        System.out.println("Test: " + testName + " | Step: " + step + " | Status: " + status);
    }
}
