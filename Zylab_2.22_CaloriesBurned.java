import java.util.Scanner;

public class CaloriesBurned {
    public static void main(String[] args) {

        /* Type your code here. */

        int age;
        int weight;
        int beats;
        int time;

        double WCAL;
        double MCAL;

        Scanner scnr = new Scanner(System.in);

        age = scnr.nextInt();
        weight = scnr.nextInt();
        beats = scnr.nextInt();
        time = scnr.nextInt();

        WCAL = ( (age * 0.074) - (weight * 0.05741) + (beats * 0.4472) - 20.4022) * time / 4.184;

        MCAL = ( (age * 0.2017) + (weight * 0.09036) + (beats * 0.6309) - 55.0969) * time/4.184;

        System.out.print("Women: ");
        System.out.printf("%.2f", WCAL);
        System.out.println(" calories");

        System.out.print("Men: ");
        System.out.printf("%.2f", MCAL);
        System.out.println(" calories");
    }
}
