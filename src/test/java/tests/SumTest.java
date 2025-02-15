package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @Test(description = "This test checks the addition of two numbers.", priority = 0, retryAnalyzer = Retry.class)
    public void checkSum() {
        double result = calculator.getSum(5, 3);
        Assert.assertEquals(result, 7);//expected 7, а не 8, чтобы отработал retry
    }

    @Test(description = "The test checks addition with a negative number.", priority = 2)
    public void checkSumWithNegativeNumber() {
        double result = calculator.getSum(-5, 3);
        Assert.assertEquals(result, -2);
    }

    @DataProvider(name = "Numbers for addition")
    public Object[][] numbersForAddition() {
        return new Object[][] {
                {40, 30},
                {20, 50},
                {35, 35},
                {69, 1},
                {0, 70},
                {160, -90},
                {22, 48},
                {61, 9},
        };
    }

    @Test(description = "This test checks the addition of different numbers.", dataProvider = "Numbers for addition", priority = 1)
    public void checkSumOfDifferentNumbers(double x, double y) {
        double result = calculator.getSum(x, y);
        Assert.assertEquals(result, 70);
    }
}
