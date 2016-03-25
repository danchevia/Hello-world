import java.util.Random;
import java.util.Scanner;

/**
 * Created by dimityr on 23.3.2016 г..
 */
public class Problem7RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.print("Please enter N :");
        Scanner inputN = new Scanner(System.in);
        int n = inputN.nextInt();

        System.out.print("Please enter M :");
        Scanner inputM = new Scanner(System.in);
        int m = inputM.nextInt();
        int x = 0;

        if (n > m) {
            for (int i = 0; i < (n - m) + 1; i++) {
                x = random.nextInt((n - m) + 1) + m;
                System.out.printf("%d ", x);
            }
        } else {
            for (int i = 0; i < (m - n) + 1; i++) {
                x = random.nextInt((m - n) + 1) + n;
                System.out.printf("%d ", x);
            }
        }
    }
}
