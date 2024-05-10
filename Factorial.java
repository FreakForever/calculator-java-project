package myPackage;

public class Factorial implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num1 < 0) {
            throw new IllegalArgumentException("Factorial can only be calculated for non-negative integers.");
        }
        

        if (num1 == 0 || num1 == 1) {
            return 1;
        }
        

        double ans = 1;
        while (num1 > 1) {
            ans *= num1;
            num1 -= 1;
        }
        return ans;
    }
}
