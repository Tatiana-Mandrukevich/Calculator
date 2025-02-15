package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest{

    @Test(description = "This test checks the division of one number by another.", priority = 1)
    public void checkDivision() {
        double result = calculator.getDivision(50, 2);
        Assert.assertEquals(result, 25);
    }

    @DataProvider(name = "Numbers for division")
    public Object[][] numbersForDivision() {
        return new Object[][] {
                {27, 3},
                {90, 10},
                {9, 1},
                {54, 6},
        };
    }

    @Test(description = "This test checks the division of different numbers.", dataProvider = "Numbers for division", priority = 0)
    public void checkDivisionOfDifferentNumbers(double x, double y) {
        double result = calculator.getDivision(x, y);
        Assert.assertEquals(result, 9);
    }
}
