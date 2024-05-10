package myPackage;
import java.lang.Math;
public class Log implements Operation{
public double calculate(double num1, double num2) {
	if (num1 <= 0 || num1 == 1) {
        throw new IllegalArgumentException("Base must be greater than 0 and not equal to 1.");
    }

    // Error handling for value
    if (num2 <= 0) {
        throw new IllegalArgumentException("Value must be greater than 0.");
    }

    // Perform the logarithm calculation
    return Math.log(num2) / Math.log(num1);
}
}
