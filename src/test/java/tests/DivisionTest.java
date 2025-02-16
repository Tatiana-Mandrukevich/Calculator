package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class DivisionTest extends BaseTest{

    @Test(description = "This test checks the division of one number by another.", priority = 1)
    public void checkDivision() {
        try {
            double result = calculator.getDivision(50, 2);
            Assert.assertEquals(result, 25);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Исключение: " + arithmeticException);
        }
    }

    @DataProvider(name = "Numbers for division")
    public Object[][] numbersForDivision() {
        return new Object[][] {
                {27, 3, 9},
                {90, 10, 9},
                {9, 1, 9},
                {54, 6, 9},
                {1, 2, 0.5},
                {1.0, 10.0, 0.1},
                {1.5, 0.3, 5.0},
        };
    }

    @Test(description = "This test checks the division of different numbers.", dataProvider = "Numbers for division", priority = 0)
    public void checkDivisionOfDifferentNumbers(double x, double y, double expectedResult) {
        try {
            double result = calculator.getDivision(x, y);
            Assert.assertEquals(result, expectedResult);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Исключение: " + arithmeticException);
        }
    }

    @Test(description = "This test checks the division by zero.", priority = 3)
    public void checkDivisionByZero() {
        try {
            double result = calculator.getDivision(3.0, 0.0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Исключение: " + arithmeticException);
        }
    }
}
