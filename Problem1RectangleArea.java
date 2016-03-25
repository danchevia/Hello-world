import java.util.Scanner;

/**
 * Created by dimityr on 22.3.2016 г..
 */
public class Problem1RectangleArea {
    public static void main (String[] args) {
        System.out.print("Please enter side a :");
        Scanner sideA = new Scanner(System.in);
        int a = sideA.nextInt();


        System.out.print("Please enter side b :");
        Scanner sideB = new Scanner(System.in);
        int b = sideB.nextInt();

        int area = a*b;

        System.out.println("Rectangle's area is : "+ area);

    }

}
