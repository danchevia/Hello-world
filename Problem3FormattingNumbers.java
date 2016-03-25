import java.util.Scanner;

/**
 * Created by dimityr on 22.3.2016 г..
 */
public class Problem3FormattingNumbers {

    public static void main(String[] args){
        System.out.println("Please enter 3 numbers");

        System.out.print("Enter a :");
        Scanner scanerA = new Scanner(System.in);
        int a = scanerA.nextInt();

        System.out.print("Enter b :");
        Scanner scanerB = new Scanner(System.in);
        double b = scanerB.nextDouble();

        System.out.print("Enter c :");
        Scanner scanerC = new Scanner(System.in);
        double c = scanerC.nextDouble();

        String hexA = Integer.toHexString(a);
        String binA = Integer.toBinaryString(a);
        int intBinA = Integer.parseInt(binA);
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",hexA,intBinA,b,c);


        }



    }


