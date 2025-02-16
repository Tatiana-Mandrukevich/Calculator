package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest{

    @Test(description = "This test checks the subtraction of one number from another.", priority = 1)
    public void checkSubtraction() {
        double result = calculator.getSubtraction(20, 3);
        Assert.assertEquals(result, 17);
    }

    @DataProvider(name = "Numbers for subtraction")
    public Object[][] numbersForSubtraction() {
        return new Object[][] {
                {40.0, 30.0, 10.0},
                {19, 9, 10},
                {99, 89, 10},
                {1000, 990, 10},
                {20, 10, 10},
                {18.5, 11.5, 7.0},
                {13.3, 9.3, 4.0},
        };
    }

    @Test(description = "This test checks the subtraction of different numbers.", dataProvider = "Numbers for subtraction", priority = 0)
    public void checkSubtractionOfDifferentNumbers(double x, double y, double expectedResult) {
        double result = calculator.getSubtraction(x, y);
        Assert.assertEquals(result, expectedResult);
    }
}
