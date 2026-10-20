import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input first and second number");

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int a = input1 + input2;
        int b = input1 - input2;
        int c = input1 * input2;
        int d = input1 / input2;
        int e = input1 % input2;

        System.out.println("sum: " + a);
        System.out.println("sub: " + b);
        System.out.println("mul: " + c);
        System.out.println("div: " + d);
        System.out.println("mod: " + e);

        scanner.close();
    }
}