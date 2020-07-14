import java.util.Scanner;

public class DivideIntegers {
    public static void main(String[] args) {
        /* Type your code here. */

        int userNum;
        int divNum;
        int newValue;
        int FinalValue;

        Scanner scnr = new Scanner(System.in);

        userNum = scnr.nextInt();
        divNum = scnr.nextInt();

        newValue = (userNum / divNum);

        System.out.print(newValue + " ");

        newValue = (newValue / divNum);

        System.out.print(newValue + " ");

        FinalValue = (newValue / divNum);

        System.out.println(FinalValue);
    }
}
