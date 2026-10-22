public class Task8 {

    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            int commulativeSum = 0;

            for (int i = 1; i <= number; i++) {
                commulativeSum += i;
            }

            System.out.println("Sum up to " + number + " = " + commulativeSum);
            total += commulativeSum;
        }
        return total;
    }

    public static void main(String[] args) {
        int finalAnswer = sum(4, 5, 10);
        System.out.println("Total Sum = " + finalAnswer);
    }
}
