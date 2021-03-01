package chouchou;

import org.testng.annotations.*;

public class BasicAnnotation {
    //用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test这是测试用例1");
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
    @Test
    public void testCase2(){
        System.out.println("test这是测试用例2");
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}
