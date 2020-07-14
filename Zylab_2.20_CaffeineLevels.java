imimport java.util.Scanner;

public class CaffeineLevels {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.

        caffeineMg = scnr.nextDouble();
        /* Type your code here. */

        double currentCaffeine;
        double secondCaff;
        double finalCaff;

        currentCaffeine = (caffeineMg / 2);
        secondCaff = (currentCaffeine / 2);
        finalCaff = (secondCaff / 4);

        System.out.print("After 6 hours: ");
        System.out.printf("%.2f", currentCaffeine);
        System.out.println(" mg");

        System.out.print("After 12 hours: ");
        System.out.printf("%.2f", secondCaff);
        System.out.println(" mg");

        System.out.print("After 24 hours: ");
        System.out.printf("%.2f", finalCaff);
        System.out.println(" mg");
    }
}
