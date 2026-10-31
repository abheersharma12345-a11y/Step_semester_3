
import java.util.Arrays;
import java.util.Scanner;

public class DiceThrowTally {

    public static int[] diceSort(int[] rolls) {

        // Step 1: Create a count array for dice values 1 to 6
        int[] count = new int[7];

        // Step 2: Count the frequency of each number
        for (int i = 0; i < rolls.length; i++) {
            count[rolls[i]]++;
        }

        // Step 3: Print the counts
        System.out.print("Counts: ");

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i] + " ");
        }

        System.out.println();

        // Step 4: Build the sorted array
        int[] sorted = new int[rolls.length];

        int index = 0;

        for (int i = 1; i <= 6; i++) {

            // Insert each number according to its frequency
            for (int j = 0; j < count[i]; j++) {
                sorted[index] = i;
                index++;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of dice throws: ");
        int n = sc.nextInt();

        int[] rolls = new int[n];

        System.out.println("Enter dice results (1 to 6):");

        for (int i = 0; i < n; i++) {
            rolls[i] = sc.nextInt();
        }

        int[] result = diceSort(rolls);

        System.out.println("Sorted: " + Arrays.toString(result));

        sc.close();
    }
}
