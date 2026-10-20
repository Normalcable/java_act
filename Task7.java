import java.util.Scanner;

public class Task7 {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mult(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter the second number");
        int b = scanner.nextInt();

        System.out.println("the sum is" + add(a, b));
        System.out.println("the difference is" + sub(a, b));
        System.out.println("the product is" + mult(a, b));
        System.out.println("the quotient is" + div(a, b));

    }
}
