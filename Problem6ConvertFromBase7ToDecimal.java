import java.util.Scanner;

/**
 * Created by dimityr on 22.3.2016 г..
 */
public class Problem6ConvertFromBase7ToDecimal {
    public static void main(String[] args){
        System.out.print("Enter Base-7 number : ");
        Scanner baseNum = new Scanner(System.in);

        String base7Num = baseNum.nextLine();
        int decimalNum = Integer.valueOf(base7Num, 7);
        System.out.print("Integer number is : ");
        System.out.println(decimalNum);
    }
}
