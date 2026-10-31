import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number greater than 1: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

        sc.close();
    }
}
