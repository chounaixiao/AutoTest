package chouchou.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite运行了");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行了");
    }
}