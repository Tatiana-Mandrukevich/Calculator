package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{

    @Test(description = "This test checks the multiplication of two numbers.", priority = 1)
    public void checkMultiplication() {
        double result = calculator.getMultiplication(10, 3);
        Assert.assertEquals(result, 30);
    }

    @Test(description = "This test checks the multiplication by zero.", priority = 2, invocationCount = 4, threadPoolSize = 2)
    public void checkMultiplicationByZero() {
        double result = calculator.getMultiplication(10, 0);
        Assert.assertEquals(result, 0);
    }

    @DataProvider(name = "Numbers for multiplication")
    public Object[][] numbersForMultiplication() {
        return new Object[][] {
                {2, 15},
                {1, 30},
                {10, 3},
                {5, 6},
        };
    }

    @Test(description = "This test checks the multiplication of different numbers.", dataProvider = "Numbers for multiplication", priority = 0)
    public void checkMultiplicationOfDifferentNumbers(double x, double y) {
        double result = calculator.getMultiplication(x, y);
        Assert.assertEquals(result, 30);
    }
}
