import java.util.Scanner;

/**
 * Created by dimityr on 23.3.2016 г..
 */
public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        System.out.println("Please enter two strings! ");

        System.out.print("Enter first string:");
        Scanner inputFirst = new Scanner(System.in);
        String firstString = inputFirst.next();

        System.out.print("Enter second string:");
        Scanner inputSecond = new Scanner(System.in);
        String secondString = inputSecond.next();
        int result = sum(firstString, secondString);

        System.out.println(result);
    }

    public static int sum(String firstString, String secondString) {
        int sum = 0;
        int multiplied = 0;

        if (firstString.length() > secondString.length()) {
            for (int i = 0; i < secondString.length(); i++) {
                multiplied = firstString.charAt(i) * secondString.charAt(i);
                sum += multiplied;
            }
            for (int i = secondString.length(); i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }
        } else if (firstString.length() < secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                multiplied = firstString.charAt(i) * secondString.charAt(i);
                sum += multiplied;
            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        } else {
            for (int i = 0; i < secondString.length(); i++) {
                multiplied = firstString.charAt(i) * secondString.charAt(i);
                sum += multiplied;
            }
        }
        return sum;
    }
}
