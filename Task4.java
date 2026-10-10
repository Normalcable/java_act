import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter a word");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(word.equals(reversed) ? "The word is a palindrome" : "The word is not a palindrome");
    }
}