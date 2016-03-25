import java.util.Scanner;

/**
 * Created by dimityr on 22.3.2016 г..
 */
public class Problem2TriangleArea {
    public static void main(String[] args) {
        System.out.println("Please enter 3 point (x / y):");

        System.out.print("Enter first :");
        Scanner first = new Scanner(System.in);
        int aX = first.nextInt();
        int aY = first.nextInt();

        System.out.print("Enter second :");
        Scanner second = new Scanner(System.in);
        int bX = first.nextInt();
        int bY = first.nextInt();

        System.out.print("Enter third :");
        Scanner third = new Scanner(System.in);
        int cX = first.nextInt();
        int cY = first.nextInt();

        if (aX == aY) {

            System.out.printf("0");
        } else {
            int result = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
            System.out.print("Area of the triangle : ");
            System.out.println(Math.abs(result));
        }
    }
}











