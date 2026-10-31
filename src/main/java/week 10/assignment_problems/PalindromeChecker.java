import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed word: " + reversed);

        if (word.equals(reversed)) {
            System.out.println(word + " - palindrome");
        } else {
            System.out.println(word + " - not a palindrome");
        }

        sc.close();
    }
}