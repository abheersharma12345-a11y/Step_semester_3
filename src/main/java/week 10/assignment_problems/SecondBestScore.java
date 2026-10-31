
import java.util.Scanner;

public class SecondBestScore {

    public static int secondHighest(int[] scores) {

        int highest = -1;
        int second = -1;

        for (int i = 0; i < scores.length; i++) {

            int current = scores[i];

            // Skip duplicate highest scores
            if (current == highest) {
                continue;
            }

            if (current > highest) {
                second = highest;
                highest = current;
            }
            else if (current > second) {
                second = current;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter player scores:");

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int result = secondHighest(scores);

        System.out.println("Second-highest distinct score: " + result);

        sc.close();
    }
}
