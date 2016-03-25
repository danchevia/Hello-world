import java.util.Scanner;

/**
 * Created by dimityr on 22.3.2016 г..
 */
public class Problem5ConvertFromDcimalSystem {
    public static void main(String[] args){
        System.out.print("Enter integer number : ");
         Scanner intNum = new Scanner(System.in);
        int x = intNum.nextInt();
        String toBase7 = Integer.toString(x,7);
        System.out.println(toBase7);
    }
}
