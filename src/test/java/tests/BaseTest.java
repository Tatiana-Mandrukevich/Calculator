package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.Calculator;

@Listeners(TestListener.class)
public class BaseTest {
    Calculator calculator;

    @BeforeMethod
    public void initTest() {
        calculator = new Calculator();
        System.out.println("The mathematical calculation has begun.");
    }

    @AfterMethod
    public void endTest() {
        System.out.println("The mathematical calculation has been completed.");
    }
}
