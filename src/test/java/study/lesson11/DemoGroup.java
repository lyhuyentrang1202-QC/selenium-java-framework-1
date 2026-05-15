package study.lesson11;

import org.testng.annotations.Test;

public class DemoGroup { // new *

    @Test(groups = "regression") // new *
    void regressionTest1() {
        System.out.println("regression test 1");
    }

    @Test(groups = "regression") // new *
    void regressionTest2() {
        System.out.println("regression test 2");
    }

    @Test(groups = "uat") // new *
    void uatTest1() {
        System.out.println("uat test 1");
    }

    @Test(groups = "acceptance") // new *
    void acceptanceTest1() {
        System.out.println("acceptance");
    }
}
