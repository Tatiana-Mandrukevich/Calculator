package pages;

public class Calculator {

    public Calculator() {}

    public double getSum(double x, double y) {
        double sum = x + y;
        System.out.println("The result of addition: " + sum);
        return sum;
    }

    public double getSubtraction(double x, double y) {
        double subtraction = x - y;
        System.out.println("The result of subtraction: " + subtraction);
        return subtraction;
    }

    public double getMultiplication(double x, double y) {
        double multiplication = x * y;
        System.out.println("The result of multiplication: " + multiplication);
        return multiplication;
    }

    public double getDivision(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        double division = x / y;
        System.out.println("The result of division: " + division);
        return division;
    }
}
