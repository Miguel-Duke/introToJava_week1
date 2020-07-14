import java.util.Scanner;

public class DrivingCosts {
    public static void main(String[] args) {
        /* Type your code here. */

        Scanner scnr = new Scanner(System.in);

        double milesPerGal;
        double dollarsPerGal;

        double mile20;
        double mile75;
        double mile100;

        milesPerGal = scnr.nextDouble();
        dollarsPerGal = scnr.nextDouble();

        mile20 = (20 / milesPerGal) * dollarsPerGal;

        mile75 = (75 / milesPerGal) * dollarsPerGal;

        mile100 = (500 / milesPerGal) * dollarsPerGal;

        System.out.printf("%.2f", mile20);

        System.out.print(" ");

        System.out.printf("%.2f", mile75);

        System.out.print(" ");

        System.out.printf("%.2f", mile100);

        System.out.println("");
    }
}
