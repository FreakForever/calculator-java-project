package myPackage;
import java.lang.Math;

public class Exponent implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
