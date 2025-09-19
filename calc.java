 class Calculator {

    // Add method
    public double add(double a, double b) {
        return a + b;
    }

    // Subtract method
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiply method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide method
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0; // or throw exception
        }
        return a / b;
    }
}

public class calc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        double a = 20, b = 5;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
