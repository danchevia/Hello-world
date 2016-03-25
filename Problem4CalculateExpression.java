import java.util.Scanner;

/**
 * Created by dimityr on 22.3.2016 г..
 */
public class Problem4CalculateExpression {
    public static void main(String[] args){
        System.out.println("Enter three floating point numbers ");

        System.out.print("Enter a: ");
        Scanner inputA = new Scanner(System.in);
        double a = inputA.nextDouble();

        System.out.print("Enter b: ");
        Scanner inputB = new Scanner(System.in);
        double b = inputB.nextDouble();

        System.out.print("Enter c: ");
        Scanner inputC = new Scanner(System.in);
        double c = inputC.nextDouble();

        double formula1 = ((a * a) + (b * b)) / ((a * a) - (b * b));
        formula1 = Math.pow(formula1, ((a + b + c) / Math.sqrt(c)));
        double formula2 = Math.pow(((a * a) + (b * b) - Math.pow(c, 3)), (a - b));
        double avgABC = (a + b + c) / 3;
        double averageForm = (formula1 + formula2) / 2;
        double diff = Math.abs(avgABC - averageForm);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1, formula2, diff);
    }

    }
