import java.util.Scanner;

/**
 * Created by dimityr on 23.3.2016 г..
 */
public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] strArr = input.split("\\s+");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        input = scan.nextLine();
        String[] commands = input.split("\\s+");
        metod (commands[2], Integer.parseInt(commands[1]), intArr);
    }
    public static void metod (String str, int count, int[] array) {
        int counter = 1;
        if (str.equals("even")) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 2 == 0) && counter <= count) {
                    System.out.print(array[i]);
                    System.out.print(" ");
                    counter++;
                }
            }
        }
        if (str.equals("odd")) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] % 2 != 0)&& counter <= count)  {
                    System.out.print(array[i]);
                    System.out.print(" ");
                    counter++;
                }
            }
        }
        System.out.println();
    }
    }

