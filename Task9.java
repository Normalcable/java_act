
import static java.lang.Math.*;

import java.util.Scanner;

public class Task9{

    public static int add(int a, int b) {
        int sum = Math.addExact(a, b);
        return sum;
    }
    public static int subtract (int a, int b) {
        int sub = Math.subtractExact(a, b);
        return sub;
    }
    public static int multiply (int a, int b) {
        return Math.multiplyExact(a, b);
    }
    public static float divide (int a, int b) {
        return (float) a / b;
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number (a): ");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter second number (b): ");
        int b = Integer.parseInt(scanner.nextLine());

        // Demonstrate the math operations here
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

        scanner.close();
    }
}
// Demonstrate the math operations here